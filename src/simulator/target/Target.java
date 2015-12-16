package simulator.target;

abstract public class Target {
    protected double x, y;
    protected double size;


    public boolean contains(double X, double Y) {
        return x < X && X < x + size && y < Y && Y < y + size;
    }

    public double getX() {return x;}
    public double getY() {return y;}
    public double getSize() {return size;}

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setSize(double size) {this.size = size;}
}
