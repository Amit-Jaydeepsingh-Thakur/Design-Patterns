package main.java.com.amit.design_patterns.behavioural.visitor.car_service;

public class CarMain {
    public static void main(String[] args) {
        Door d = new Door();
        Wheel w = new Wheel();
        Engine e = new Engine();

        CarServiceVisitor cs = new CarServiceVisitor();

        d.accept(cs);
        w.accept(cs);
        e.accept(cs);
    }
}
