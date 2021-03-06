package Model.VQ;

import Model.OutputVariable;
import parsers.VQParser.VQParse;

import java.util.*;

/**
 * Created by battow on 12-Apr-17.
 */
public class VQParseTree {
    private double firstGradient = 0, secondGradient = 1;
    private String firstColor, secondColor;
    private VQNode root;
    private VQType type = null;
    private Collection<String> usedVariables = new ArrayList<>();
    private String parseError = "";
    private VQColors vqColors;
    private boolean useMin = false, useMax = false;

    public enum VQType { Edge, Node, Unknown}

    /**
     * Gets a gradient between 0 and 1 for the value calculated for the VQ
     * @param variables
     * @return
     * @throws Exception
     */
    public double getGradient(Map<String, Double> variables) throws Exception {
        if(secondGradient <= firstGradient)
            throw new Exception("The maximum gradient must be greater than the minimum gradient");

        double gradientValue = gradientValue(firstGradient, secondGradient, root.calculateNodeValue(variables));
        if (gradientValue >= 1.0)
            return 1.0;
        else if (gradientValue <= 0.0)
            return 0.0;

        return gradientValue;
    }

    /**
     * Gets the exact value of the expression without gradient conversion
     * @param variables
     * @return expression value
     * @throws Exception
     */
    public double getExpressionValue(Map<String, Double> variables) throws Exception {
        return root.calculateNodeValue(variables);
    }

    private double gradientValue(double min, double max, double value) {
        double diff = max - min;
        if (diff > 0)
            return (value - min) / diff;
        return 0;
    }

    //Getters & setters
    public void setFirstGradient(double firstGradient, boolean neg) {
        if(neg)
            this.firstGradient = -firstGradient;
        else
            this.firstGradient = firstGradient;
    }

    public void setSecondGradient(double secondGradient, boolean neg) {
        if(neg)
            this.secondGradient = -secondGradient;
        else
            this.secondGradient = secondGradient;
    }

    public void setFirstGradient(double firstGradient) {
        setFirstGradient(firstGradient, false);
    }

    public void setSecondGradient(double secondGradient) {
        setSecondGradient(secondGradient, false);
    }

    public void setFirstColor(String firstColor) {
        this.firstColor = firstColor;
    }

    public void setSecondColor(String secondColor) {
        this.secondColor = secondColor;
    }

    public double getFirstGradient() {
        return firstGradient;
    }

    public double getSecondGradient() {
        return secondGradient;
    }

    public String getFirstColor() {
        return firstColor;
    }

    public String getSecondColor() {
        return secondColor;
    }

    public VQNode getRoot() {
        return root;
    }

    public void setRoot(VQNode root) {
        this.root = root;
    }

    public Collection<String> getUsedVariables() {
        return usedVariables;
    }

    public void addUsedVariable(String var) {
        usedVariables.add(var);
    }

    public VQColors getVqColors() {
        return vqColors;
    }

    public void setVqColors(VQColors vqColors) {
        this.vqColors = vqColors;
    }

    public boolean useMin() {
        return useMin;
    }

    public void setUseMin(boolean useMin) {
        this.useMin = useMin;
    }

    public boolean useMax() {
        return useMax;
    }

    public void setUseMax(boolean useMax) {
        this.useMax = useMax;
    }

    public String getParseError() {
        return parseError;
    }

    public void addToParseError(String parseError) {
        if(!this.parseError.isEmpty())
            this.parseError += System.lineSeparator();
        this.parseError += parseError;
    }

    public VQType getType() {
        return type;
    }

    public void calculateVQType(List<OutputVariable> allVars) {
        VQType foundType = VQType.Unknown;
        try {
            for (String varInVQ : getUsedVariables()) {
                Optional<OutputVariable> usedVar = allVars.stream()
                        .filter(o -> o.toString().equals(varInVQ))
                        .findFirst();
                if(usedVar.isPresent()){
                    if (usedVar.get().getIsNodeData()) {
                        if (foundType == VQType.Edge)
                            throw new Exception("Mixed both Edge and Node types");

                        foundType = VQType.Node;
                    } else if (usedVar.get().getIsEdgeData()) {
                        if (foundType == VQType.Node)
                            throw new Exception("Mixed both Edge and Node types");

                        foundType = VQType.Edge;
                    } else {
                        throw new Exception("Cannot use global variables");
                    }
                }
            }
        } catch (Exception e) {
            addToParseError(e.getMessage());
        }
        type = foundType;
    }

    public boolean isValid() {
        return type != null && type != VQType.Unknown && parseError.isEmpty();
    }
}
