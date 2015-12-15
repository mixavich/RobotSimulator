package simulator.simulation;

public class DefaultSimulation implements Simulation {

    @Override
    public void execute() {
        System.out.println("Начало симуляции");
        for (int i = 0; i < 5; i++)
            nextIteration();
        stop();
    }

    @Override
    public void stop() {
        System.out.println("конец симуляции");
    }

    @Override
    public void nextIteration() {
        System.out.println("следующая итерация");
    }
}
