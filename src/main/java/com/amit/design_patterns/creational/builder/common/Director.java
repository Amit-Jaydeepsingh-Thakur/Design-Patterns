package main.java.com.amit.design_patterns.creational.builder.common;

import main.java.com.amit.design_patterns.creational.builder.model.Builder;
import main.java.com.amit.design_patterns.creational.builder.model.CarType;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructHatchback() {
        System.out.println("Constructing the Hatchback");
        builder.setCarType(CarType.HATCHBACK);
        builder.setEngine("2.2L");
        builder.setTransmission("Automatic");
        builder.setGPS("Apple GPS");
        builder.setSeats(4);
        builder.setWheels(4);
    }

    public void constructMUV() {
        System.out.println("Constructing the MUV");
        builder.setCarType(CarType.MUV);
        builder.setEngine("4.1L");
        builder.setTransmission("Automatic");
        builder.setGPS("Apple GPS");
        builder.setSeats(4);
        builder.setWheels(4);
    }

    public void constructSedan() {
        System.out.println("Constructing the Sedan");
        builder.setCarType(CarType.SEDAN);
        builder.setEngine("2.2L");
        builder.setTransmission("Automatic");
        builder.setGPS("Apple GPS");
        builder.setSeats(4);
        builder.setWheels(4);
    }

    public void constructSUV() {
        System.out.println("Constructing the SUV");
        builder.setCarType(CarType.SUV);
        builder.setEngine("4.1L");
        builder.setTransmission("Manual + Automatic");
        builder.setGPS("Apple GPS");
        builder.setSeats(4);
        builder.setWheels(4);
    }
}
