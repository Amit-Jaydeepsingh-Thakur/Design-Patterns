package main.java.com.amit.design_patterns.behavioural.visitor.car_service;

public interface CarPart {
    public void accept(CarPartVisitor visitor);
}
