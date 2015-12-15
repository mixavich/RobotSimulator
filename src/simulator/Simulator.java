package simulator;

import simulator.configuration.Configuration;

import java.io.File;

public final class Simulator {

    public static void main(String[] args) {
        System.out.println("Роботы поработят мир!!!");
        Configuration config = new Configuration(new File("configuration.txt"));
        config.getSimulation().execute();
    }

}
