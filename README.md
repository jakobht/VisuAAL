**Important** Note on this fork
1. It runs the simulation 1000 times faster than the original to allow millisecond precision.
2. To use it you _need to_ hardcode the path to the uppaal binary and the path to any shared libs in `/Visualizer/src/Helpers/UPPAALExecutor.java` lines 80 and 84.

# Visualizing Behavior of Distributed Network Protocols using UPPAAL Simulations

If you load a UPPAAL model for a distributed network protocol into this application, you can get useful insight of what going on in the protocol over time. 
* The topology should be a 2D array named `CONFIG_connected`
* The parameters that make sense to configure should be prefixed with `CONFIG_`
* The variables that makes sense to observe during simulations should be prefixed with `OUTPUT_`

This tool is work in progress, developed as part of a master thesis on [Aalborg University](http://www.aau.dk/).

We use the following libraries in our application: [ANTLR4](http://www.antlr.org/), [GraphStream](http://graphstream-project.org/), [JUnit](http://junit.org), [GmapsFX](http://rterp.github.io/GMapsFX/). The licenses of the libraries is found in the License directory and must be adhered to in addition to our own.

des103f17
