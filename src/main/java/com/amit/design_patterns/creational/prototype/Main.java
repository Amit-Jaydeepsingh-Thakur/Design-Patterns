package main.java.com.amit.design_patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prototype design pattern");

        Rectangle r = new Rectangle();
        r.setX(9);
        r.setY(9);

        Circle c = new Circle();
        c.setRadius(9);

        Circle c_copy = (Circle) c.clone();
        Rectangle r_copy = (Rectangle) r.clone();

        System.out.println(c.getRadius() + " " + c_copy.getRadius());
        if (r.isEqual(r_copy)) {
            System.out.println("They are equal : Rectangle");
        }

        if (c.isEqual(c_copy)) {
            System.out.println("They are equal : Circle");
        }
    }
}
