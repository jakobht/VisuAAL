package View.topology;

import Helpers.GoogleMapsHelper;
import Helpers.Pair;
import Model.topology.LatLng;
import Model.topology.LatLngBounds;
import View.ImageViewPane;
import View.simulation.MouseClickListener;
import View.simulation.SimulationDataContainer;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.MapReadyListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import org.graphstream.graph.Graph;
import org.graphstream.ui.fx_viewer.FxViewer;
import org.graphstream.ui.view.Viewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by lajtman on 27-03-2017.
 */
public class TopologyViewerController implements Initializable, MapComponentInitializedListener, MapReadyListener {
    static private boolean isTopologyGenerator = true;
    public StackPane rootPane;
    @FXML
    private StackPane graphStreamNode;
    @FXML
    private ImageViewPane backgroundView;
    private BooleanProperty showMap = new SimpleBooleanProperty(true);
    private BooleanProperty showGraph = new SimpleBooleanProperty(true);
    private BooleanProperty initialized = new SimpleBooleanProperty(false);
    private BooleanProperty mapInteractable = new SimpleBooleanProperty(true);
    private BooleanProperty showBackgroundImage = new SimpleBooleanProperty(false);
    private BooleanProperty graphDraggable = new SimpleBooleanProperty(false);
    private GoogleMapView mapView;
    private GoogleMap map;
    private Graph currentlyShownGraph;
    private org.graphstream.ui.view.View swingView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (isTopologyGenerator) {
            mapView = new GoogleMapView();
            rootPane.getChildren().add(mapView);
            mapView.toBack();
            mapView.addMapInializedListener(this);
            mapView.addMapReadyListener(this);
            mapView.visibleProperty().bind(showMap);
            mapView.mouseTransparentProperty().bind(mapInteractable.not());
            isTopologyGenerator = false;
        }

        initialized.set(true);
        backgroundView.visibleProperty().bind(showBackgroundImage);
        graphStreamNode.mouseTransparentProperty().bind(graphDraggable.not());
        graphStreamNode.visibleProperty().bind(showGraph);
    }

    @Override
    public void mapInitialized() {
        MapOptions options = new MapOptions();

        LatLng location = GoogleMapsHelper.getDefaultLocation();
        options.center(new LatLong(location.lat, location.lng))
                .mapType(MapTypeIdEnum.TERRAIN)
                .overviewMapControl(false)
                .panControl(true)
                .rotateControl(false)
                .scaleControl(true)
                .streetViewControl(false)
                .zoomControl(false)
                .zoom(13);

        map = mapView.createMap(options);

        mapView.prefWidthProperty().bind(rootPane.widthProperty());
        mapView.prefHeightProperty().bind(rootPane.heightProperty());
    }

    public void showGraph(Graph g, boolean autoLayout, SimulationDataContainer nodeVarGridPane) {
        this.showGraph(g, autoLayout, nodeVarGridPane, null);
    }

    public void showGraph(Graph g, boolean autoLayout, SimulationDataContainer nodeVarGridPane, NodeMovedEventListener listener) {
        currentlyShownGraph = g;
        Viewer v = new FxViewer(currentlyShownGraph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        if (autoLayout) v.enableAutoLayout();
        v.enableXYZfeedback(!autoLayout);
        MouseClickListener mouse = new MouseClickListener(v, currentlyShownGraph, nodeVarGridPane);
        if (listener != null) mouse.addNodesMovedListener(listener);
        mouse.start();

        swingView = v.addDefaultView(false);
        // TODO: FIXME
//        graphStreamNode.getChildren().add(swingView);

        if (map != null) {
            Pair<Double, Double> widthAndHeight = GoogleMapsHelper.calculateSizeInMeters(getMapBounds());
            setGraphViewport(widthAndHeight);
        }
    }

    public void setGraphViewport(Pair<Double, Double> widthAndHeight) {
        SwingUtilities.invokeLater(() -> {
            swingView.getCamera().setGraphViewport(0, 0, widthAndHeight.getFirst(), widthAndHeight.getSecond());
            swingView.getCamera().setViewCenter(widthAndHeight.getFirst() / 2, widthAndHeight.getSecond() / 2, 0);
        });
    }

    public boolean isMapShown() {
        return showMap.get();
    }

    public BooleanProperty showMapProperty() {
        return showMap;
    }

    public void setShowMap(boolean showMap) {
        if (showMap && showBackgroundImage.get()) {//Mutex between map and background
            showBackgroundImage.set(false);
        }
        this.showMap.set(showMap);
    }

    public void setShowBackgroundImage(boolean showBackground) {
        if (showBackground && showMap.get()) { //Mutex between map and background
            showMap.set(false);
        }
        showBackgroundImage.set(showBackground);
    }

    public LatLngBounds getMapBounds() {
        return new LatLngBounds(map.getBounds());
    }

    public void setMapBounds(LatLngBounds bounds) {
        map.fitBounds(bounds.getAsLatLongBounds());
    }

    public BooleanProperty isInitializedProperty() {
        return initialized;
    }

    public BooleanProperty mapInteractableProperty() {
        return mapInteractable;
    }

    public void setIsMapInteractable(boolean interactable) {
        mapInteractable.set(interactable);
    }

    @Override
    public void mapReady() {
        initialized.set(true);
    }

    public void saveMapSnapshot(File saveToFile) throws IOException {
        ImageIO.write(SwingFXUtils.fromFXImage(getMapSnapshot(), null), "png", saveToFile);
    }

    public Image getMapSnapshot() {
        return mapView.snapshot(new SnapshotParameters(), null);
    }

    /**
     * @param image the image to show as background
     */
    public void setBackgroundImage(Image image) {
        backgroundView.getImageView().imageProperty().set(image);
        backgroundView.getImageView().setPreserveRatio(true);

        Bounds parentBounds = rootPane.getBoundsInLocal();
        backgroundView.resize(parentBounds.getWidth(), parentBounds.getHeight());
        setShowBackgroundImage(true);
    }

    public void setIsGraphDraggable(boolean isGraphDraggable) {
        graphDraggable.set(isGraphDraggable);
    }

    public BooleanProperty graphDraggableProperty() {
        return graphDraggable;
    }

    public BooleanProperty showGraphProperty() {
        return showGraph;
    }

    public Graph getCurrentlyShownGraph() {
        return currentlyShownGraph;
    }

    public void panTo(LatLngBounds destination) {
        map.panToBounds(destination.getAsLatLongBounds());
    }

    public void resetViewPort() {
        SwingUtilities.invokeLater(() -> {
                    swingView.getCamera().resetView();
                }
        );
    }
}
