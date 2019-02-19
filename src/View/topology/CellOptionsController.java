package View.topology;

import Model.topology.generator.CellOptions;
import View.DoubleTextField;
import View.IntegerTextField;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * Created by lajtman on 20-03-2017.
 */
public class CellOptionsController implements AutoCloseable {
    @FXML
    private Pane rootPane;
    @FXML
    private GridPane gridPane;
    @FXML
    private DoubleTextField txtNodesCellDeviation;
    @FXML
    private IntegerTextField txtAvgNodesPrCell;
    @FXML
    private DoubleTextField txtCellAvgRangeDeviation;
    @FXML
    private IntegerTextField txtCellAvgRangeMean;

    private CellOptions options;

    public CellOptions getOptions() {
        return options;
    }

    public void initWithOptions(CellOptions pOptions) {
        options = pOptions;

        txtNodesCellDeviation.bindProperty(options.nodesCellDeviationProperty());
        txtAvgNodesPrCell.bindProperty(options.avgNodesPrCellProperty());
        txtCellAvgRangeDeviation.bindProperty(options.rangeDeviationProperty());
        txtCellAvgRangeMean.bindProperty(options.avgRangeProperty());

        showCellOptions(false);
    }

    void showCellOptions(boolean show) {
        String style = show ? "-fx-opacity: 1" : "-fx-opacity: 0";
        gridPane.setStyle(style);
        rootPane.setMouseTransparent(!show);
    }

    @Override
    public void close() throws Exception {
        rootPane = null;
        gridPane = null;
        txtNodesCellDeviation = null;
        txtAvgNodesPrCell = null;
        txtCellAvgRangeDeviation = null;
        txtCellAvgRangeMean = null;
    }

    public void setSize(double widthAndHeight) {
        rootPane.setMaxHeight(widthAndHeight);
        rootPane.setMinHeight(widthAndHeight);
        rootPane.setMaxWidth(widthAndHeight);
        rootPane.setMinWidth(widthAndHeight);
    }
}
