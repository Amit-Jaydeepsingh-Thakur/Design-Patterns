package main.java.com.amit.design_patterns.creational.factory;

public class Ship implements Vehicle {

    @Override
    public Vehicle getVehicleType() {
        return new Ship();
    }
}
