package main.java.com.amit.design_patterns.creational.factory;

public class Truck implements Vehicle {

    @Override
    public Vehicle getVehicleType() {
        return new Truck();
    }
}
