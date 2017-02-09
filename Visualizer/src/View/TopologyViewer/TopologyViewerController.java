package View.TopologyViewer;

import Model.UPPAALEdge;
import Model.UPPAALTopology;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebView;
import Model.CVar;
import parsers.UPPAALParser;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TopologyViewerController implements Initializable {

    @FXML
    private WebView webView;
    @FXML
    private TableColumn columnName;
    @FXML
    private TableColumn columnValue;
    @FXML
    private TableView constantsTable;
    @FXML
    private TextField modelPathField;
    @FXML
    private Button loadModelButton;
    @FXML
    private GridPane horizontalGrid;
    @FXML
    private TabPane tabPane;
    @FXML
    private GridPane rootElement;
    @FXML
    private GridPane viewerGridPane;
    @FXML
    private TextArea tempTopologyTextArea;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadWebsite(null);
        columnName.prefWidthProperty().bind(constantsTable.widthProperty().multiply(0.2));
        columnValue.prefWidthProperty().bind(constantsTable.widthProperty().multiply(0.8));

        columnName.setCellValueFactory( p -> {
            CVar<String> x = ((TableColumn.CellDataFeatures<CVar<String>, String>)p).getValue();
            return new SimpleStringProperty(x.getName());
        });

        columnValue.setCellValueFactory( p -> {
            CVar<Integer> x = ((TableColumn.CellDataFeatures<CVar<Integer>, String>)p).getValue();
            return new SimpleStringProperty(x.getValue().toString());
        });

        loadModelButton.prefWidthProperty().bind(horizontalGrid.widthProperty().multiply(0.2));
        modelPathField.prefWidthProperty().bind(horizontalGrid.widthProperty().multiply(0.8));
        tabPane.prefWidthProperty().bind(rootElement.widthProperty());
        viewerGridPane.prefWidthProperty().bind(tabPane.widthProperty());
        webView.prefWidthProperty().bind(viewerGridPane.widthProperty());
    }

    public void addConstantsToList(ArrayList<CVar<Integer>> constants){
        constantsTable.getItems().addAll(constants);
    }

    public void addTopologyPairsToTextArea(UPPAALTopology topology) {//TODO: Smid ind i webviewet i stedet - temp, smid i textarea!
        tempTopologyTextArea.clear();
        tempTopologyTextArea.setText("#Nodes: " + String.valueOf(topology.get_numberOfNodes())+"\n");
        for (UPPAALEdge e: topology) {
            tempTopologyTextArea.setText(tempTopologyTextArea.getText()+ e.toString() + "\n");
        }
    }

    public void loadModel(ActionEvent actionEvent) {
        constantsTable.getItems().clear();

        String modelPathContents = modelPathField.getText();
        if(modelPathContents.length() == 0) return;

        if (!modelPathContents.endsWith(".xml")) modelPathContents += ".xml";

        File f = new File(modelPathContents);
        if (f.exists() && !f.isDirectory()) {
            addConstantsToList(UPPAALParser.getUPPAALConfigConstants(modelPathContents));
            UPPAALTopology topology = UPPAALParser.getUPPAALTopology(modelPathContents);
            addTopologyPairsToTextArea(topology);
            updateGraph(topology);
        }
    }

    public void loadWebsite(ActionEvent actionEvent) {
        webView.getEngine().load(getArborPageLocation());
    }

    public String getArborPageLocation() {
        return "file:///" + Paths.get("src", "Arbor", "index.html").normalize().toAbsolutePath().toString();
    }

    public void updateGraph(UPPAALTopology topology) {
        for (int i = 0; i < topology.get_numberOfNodes(); i++) {
            addNodeToView(String.valueOf(i));
        }
        for (UPPAALEdge edge: topology) {
            addEdgeToView(String.valueOf(edge.get_source()), String.valueOf(edge.get_destination()));
        }
    }

    public void addEdgeToView(String source, String destination){
        //TODO: Interface with Graph
        //"NodeGraph".addEdge("", source, destination);
    }

    public void addNodeToView(String id){
        //TODO: Interface with Graph
        //"NodeGraph".addNode(id);
    }
}
