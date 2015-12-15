package simulator.target;

abstract public class Target {
    protected int x, y;
    protected int size;

    public int getX() {return x;}
    public int getY() {return y;}
    public int getSize() {return size;}

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setSize(int size) {this.size = size;}
}
