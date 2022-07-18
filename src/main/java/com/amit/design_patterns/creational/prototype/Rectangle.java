package main.java.com.amit.design_patterns.creational.prototype;

public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle() {

    }

    public Rectangle(Rectangle target) {
        super(target);
        this.x = target.getX();
        this.y = target.getY();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public boolean isEqual(Object copy) {

        if (!(copy instanceof Rectangle)) {
            return false;
        }

        Rectangle r = (Rectangle) copy;

        if (r.getX() == this.x && r.getY() == this.y) {
            return true;
        }

        return false;
    }
}
