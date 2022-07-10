package main.java.com.amit.design_patterns.behavioural.visitor.car_service;

public class Engine implements CarPart {

    @Override
    public void accept(CarPartVisitor visitor) {
        visitor.visit(this);
    }
}
