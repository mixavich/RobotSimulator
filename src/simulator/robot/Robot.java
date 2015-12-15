package simulator.robot;

abstract public class Robot {
    protected int x, y;
    protected int speed;

    abstract void doStep();
    abstract void targetDone();


    // ------- getter and setter region start -------//
    public int getX() {return x;}
    public int getY() {return y;}
    public int getSpeed() {return speed;}

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setSpeed(int speed) {this.speed = speed;}
    // ------- getter and setter region end   -------//
}
