package simulator.configuration;

import simulator.simulation.DefaultSimulation;
import simulator.simulation.Simulation;

import java.io.File;

public class Configuration {

    public Configuration(File file) {
        // TODO магию
    }

    public Simulation getSimulation() {return new DefaultSimulation();}
}
