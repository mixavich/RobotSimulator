package simulator.robot;

import simulator.target.Target;

public class DefaultRobot extends Robot {

    @Override
    public void targetDone() {
        System.out.println("я дошел!");
    }

    @Override
    public void doStep() {
        for (Target target : targets) {
            if (target.contains(x, y)) targetDone();
        }

        double dist = Double.MAX_VALUE;
        double angle = 0f;
        for (Target target : targets) {
            double temp = Math.sqrt(Math.pow(x - target.getX(), 2) - Math.pow(x - target.getX(), 2));
            if (temp < dist) {
                dist = temp;
                angle = Math.atan((y - target.getY()) / (x - target.getX()));
            }
        }

        x -= Math.cos(angle) * speed;
        y -= Math.sin(angle) * speed;
    }

    @Override
    public void whoNear() {
        // на самом деле ты одинок.
    }
}
