package main.java.com.amit.design_patterns.creational.prototype;

public abstract class Shape {
    private int x;
    private int y;
    private String colour;

    public Shape() {

    }

    public Shape(Shape target) {
        this.x = target.getX();
        this.y = target.getY();
        this.colour = target.getColour();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract Shape clone();

    public boolean isEqual(Object copy) {
        if (! (copy instanceof Shape)) {
            return false;
        }

        Shape shape2 = (Shape)(copy);

        if (shape2.x == this.x && shape2.y == this.y) {
            return true;
        }

        return false;
    }
}
