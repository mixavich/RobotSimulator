package simulator.configuration;

import simulator.field.DefaultField;
import simulator.field.Field;
import simulator.robot.DefaultRobot;
import simulator.robot.Robot;
import simulator.simulation.DefaultSimulation;
import simulator.simulation.Simulation;
import simulator.target.DefaultTarget;
import simulator.target.Target;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;

public class Configuration {

    private static Configuration instance = null;

    private Constructor constructorSimulation;
    private Constructor constructorRobot;
    private Constructor constructorTarget;
    private Constructor constructorField;

    static public Configuration getInstance() {
        if (instance == null)
            return new Configuration();
        else
            return instance;
    }

    public Configuration() {
        constructorSimulation = null;
        constructorRobot  = null;
        constructorTarget = null;
        constructorField  = null;
        instance = this;
    }

    public Configuration(File file) {
        instance = this;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            constructorSimulation = Class.forName(reader.readLine()).getConstructor();
            constructorRobot  = Class.forName(reader.readLine()).getConstructor();
            constructorTarget = Class.forName(reader.readLine()).getConstructor();
            constructorField  = Class.forName(reader.readLine()).getConstructor();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Simulation newSimulationInstance() {
        try {
            return (Simulation) constructorSimulation.newInstance();
        } catch (Exception e) {
            System.err.println("Ошибка создания симуляции");
            e.printStackTrace();
            return new DefaultSimulation();
        }
    }

    public Robot newRobotInstance() {
        try {
            return (Robot) constructorRobot.newInstance();
        } catch (Exception e) {
            System.err.println("Ошибка создания робота");
            e.printStackTrace();
            return new DefaultRobot();
        }
    }

    public Target newTargetInstance() {
        try {
            return (Target) constructorTarget.newInstance();
        } catch (Exception e) {
            System.err.println("Ошибка создания цели");
            e.printStackTrace();
            return new DefaultTarget();
        }
    }

    public Field newFieldInstance() {
        try {
            return (Field) constructorField.newInstance();
        } catch (Exception e) {
            System.err.println("Ошибка создания поля");
            e.printStackTrace();
            return new DefaultField();
        }
    }

}
