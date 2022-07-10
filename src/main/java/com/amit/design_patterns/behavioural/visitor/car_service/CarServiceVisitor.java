package main.java.com.amit.design_patterns.behavioural.visitor.car_service;

public class CarServiceVisitor implements CarPartVisitor {

    @Override
    public void visit(Door door) {
        System.out.println("The Engineer is checking the Door");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("The Engineer is checking the Wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("The Engineer is checking the Engine");
    }
}
