package View.Options;

import Helpers.TopologyHelper;
import Model.Simulations;

/**
 * Created by Tim on 09-03-2017.
 */
public class ExportTopologyOption extends SimulationOption {
    public ExportTopologyOption(Simulations simulations) {
        super(simulations);
    }

    @Override
    public String getDescription() {
        return "Incidence Matrix for Topology...";
    }

    @Override
    public void startAction() {
        TopologyHelper.saveTopology(simulations.getTopology());
    }
}
