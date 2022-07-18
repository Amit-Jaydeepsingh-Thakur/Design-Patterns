package main.java.com.amit.design_patterns.creational.prototype;

public class Circle extends Shape {
    private int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isEqual(Object copy) {

        if (!(copy instanceof Circle)) {
            return false;
        }

        Circle c = (Circle) copy;

        if (c.getRadius() == this.radius) {
            return true;
        }

        return false;
    }
}
