package Model.VQ;

import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by batto on 10-Apr-17.
 */
public class VQNodeBinaryOperator extends VQNode {

    @Override
    protected double calculateNodeValue(Map<String, Double> variables) throws Exception {
        return calculateOperator(() -> this.children.get(0).calculateNodeValue(variables),
                () -> this.children.get(1).calculateNodeValue(variables));
    }

    protected double calculateOperator(Callable<Double> v1, Callable<Double> v2) throws Exception {
        throw new Exception("This class should not be used directly. Override in specific operators");
    }
}