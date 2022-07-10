package main.java.com.amit.design_patterns.behavioural.visitor.car_service;

public class Wheel implements CarPart {

    @Override
    public void accept(CarPartVisitor visitor) {
        visitor.visit(this);
    }
}
