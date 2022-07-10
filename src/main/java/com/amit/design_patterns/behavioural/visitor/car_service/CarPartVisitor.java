package main.java.com.amit.design_patterns.behavioural.visitor.car_service;

public interface CarPartVisitor {
    public void visit(Door door);
    public void visit(Wheel wheel);
    public void visit(Engine engine);
}
