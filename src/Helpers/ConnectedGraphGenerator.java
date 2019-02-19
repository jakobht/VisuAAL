package Helpers;

import Model.UPPAALTopology;
import org.graphstream.algorithm.generator.DorogovtsevMendesGenerator;
import org.graphstream.algorithm.generator.Generator;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

/**
 * Created by batto on 13-Feb-17.
 */
public class ConnectedGraphGenerator {
    public static String matrix(int size) {
        String s = "int CONFIG_connected[CONFIG_NR_NODES][CONFIG_NR_NODES] = {";
        for (int i = 0; i < size; i++) {
            s += "\n{";
            for (int j = 0; j < size; j++) {
                if (square(i, j, (int) Math.sqrt(size))) {
                    s += "1";
                } else {
                    s += "0";
                }
                if (j < size - 1)
                    s += ",";
            }
            s += "}";
            if (i < size - 1) {
                s += ",";
            }
        }
        s += "\n};";
        return s;
    }

    public static boolean square(int my_id, int other_id, int NR_NODES_SQR_ROOT) {
        if (my_id % NR_NODES_SQR_ROOT == 0)
            return my_id - other_id == -1 || my_id - other_id == NR_NODES_SQR_ROOT || my_id - other_id == -NR_NODES_SQR_ROOT;
        if (my_id % NR_NODES_SQR_ROOT == NR_NODES_SQR_ROOT - 1)
            return my_id - other_id == 1 || my_id - other_id == NR_NODES_SQR_ROOT || my_id - other_id == -NR_NODES_SQR_ROOT;
        return my_id - other_id == -1 || my_id - other_id == 1 || my_id - other_id == NR_NODES_SQR_ROOT || my_id - other_id == -NR_NODES_SQR_ROOT;
    }

    public static UPPAALTopology generateRandomTopology(int numberOfNodes) {
        Graph graph = new MultiGraph("Random graph with " + numberOfNodes + " nodes");
        if (numberOfNodes < 3) { //generate trivial topology for one and two nodes
            if (numberOfNodes == 0)
                throw new IllegalArgumentException("Number of nodes should be at least 1");
            if (numberOfNodes >= 1) {
                graph.addNode("0");
            }
            if (numberOfNodes == 2) {
                graph.addNode("1");
                graph.addEdge("0-1", "0", "1");
            }
        } else {
            Generator gen = new DorogovtsevMendesGenerator();
            gen.addSink(graph);
            gen.begin();
            for (int i = 3; i < numberOfNodes; i++)
                gen.nextEvents();
            gen.end();
        }
        return new UPPAALTopology(graph);
    }

    public static UPPAALTopology generateSquareTopology(int squareSize) throws InterruptedException {
        int numEdgesToAddOnEachRow = squareSize - 1;

        Graph graph = new MultiGraph("Random graph with " + numEdgesToAddOnEachRow + " nodes");
        Generator gen = new SquareGraphGenerator(true, squareSize);
        gen.addSink(graph);
        gen.begin();

        for (int i = 0; i < numEdgesToAddOnEachRow; i++)
            gen.nextEvents();
        gen.end();

        int initEdgeCount = graph.getEdgeCount();
        for (int i = 0; i < initEdgeCount; i++) {
            Edge curEdge = graph.getEdge(i);
            Node from = curEdge.getSourceNode();
            Node to = curEdge.getTargetNode();
            graph.addEdge(String.valueOf(graph.getEdgeCount()), to,
                    from, true);
        }
        return new UPPAALTopology(graph);
    }

    public static String optimizedMatrix(int size) {
        String s = "int CONFIG_connected_opt[CONFIG_num_nodes][CONFIG_num_nodes] = {";
        int index = 0;
        for (int i = 0; i < size; i++) {
            s += "\n{";
            for (int j = 0; j < size; j++) {
                if (square(i, j, (int) Math.sqrt(size))) {
                    s += j + ",";
                    index++;
                }
            }
            for (; index < size; index++) {
                s += "-1";
                if (index < size - 1) {
                    s += ",";
                }
            }

            s += "}";
            if (i < size - 1) {
                s += ",";
            }
            index = 0;
        }
        s += "\n};";
        return s;
    }

    public static String matrix_exp6(int size) {
        StringBuilder sb = new StringBuilder();
        sb.append("int CONFIG_connected[CONFIG_NR_NODES][CONFIG_NR_NODES] = {");
        for (int i = 0; i < size; i++) {
            sb.append("\n{");
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    int k = j + size;
                    if (k <= i + 5) {
                        sb.append("1");
                    } else
                        sb.append("0");
                } else if (j > i) {
                    if (j <= i + 5) {
                        sb.append("1");
                    } else
                        sb.append("0");
                } else
                    sb.append("0");

                if (j < size - 1)
                    sb.append(",");
            }

            sb.append("}");
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("\n};");
        return sb.toString();
    }
}
