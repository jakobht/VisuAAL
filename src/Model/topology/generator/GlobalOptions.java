package Model.topology.generator;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Created by lajtman on 17-03-2017.
 */
public class GlobalOptions {
    private IntegerProperty cellX, cellY, avgNodesPrCell, avgRange;
    private DoubleProperty rangeDeviation, nodesCellDeviation;

    public GlobalOptions() {
        cellX = new SimpleIntegerProperty(this, "cellX", 4);
        cellY = new SimpleIntegerProperty(this, "cellY", 3);
        avgRange = new SimpleIntegerProperty(this, "avgRange", 1000);
        avgNodesPrCell = new SimpleIntegerProperty(this, "avgNodesPrCell", 5);
        rangeDeviation = new SimpleDoubleProperty(this, "rangeDeviation", 100);
        nodesCellDeviation = new SimpleDoubleProperty(this, "nodesCellDeviation", 1);
    }

    public int getCellX() {
        return cellX.get();
    }

    public void setCellX(int cellX) {
        this.cellX.set(cellX);
    }

    public IntegerProperty cellXProperty() {
        return cellX;
    }

    public int getCellY() {
        return cellY.get();
    }

    public void setCellY(int cellY) {
        this.cellY.set(cellY);
    }

    public IntegerProperty cellYProperty() {
        return cellY;
    }

    public Integer getAvgRange() {
        return avgRange.get();
    }

    public void setAvgRange(Integer avgRange) {
        this.avgRange.set(avgRange);
    }

    public IntegerProperty avgRangeProperty() {
        return avgRange;
    }

    public int getAvgNodesPrCell() {
        return avgNodesPrCell.get();
    }

    public void setAvgNodesPrCell(int avgNodesPrCell) {
        this.avgNodesPrCell.set(avgNodesPrCell);
    }

    public IntegerProperty avgNodesPrCellProperty() {
        return avgNodesPrCell;
    }

    public double getRangeDeviation() {
        return rangeDeviation.get();
    }

    public void setRangeDeviation(double rangeDeviation) {
        this.rangeDeviation.set(rangeDeviation);
    }

    public DoubleProperty rangeDeviationProperty() {
        return rangeDeviation;
    }

    public double getNodesCellDeviation() {
        return nodesCellDeviation.get();
    }

    public void setNodesCellDeviation(double nodesCellDeviation) {
        this.nodesCellDeviation.set(nodesCellDeviation);
    }

    public DoubleProperty nodesCellDeviationProperty() {
        return nodesCellDeviation;
    }
}
