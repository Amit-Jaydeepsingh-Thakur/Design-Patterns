package main.java.com.amit.design_patterns.creational.builder.model;

public abstract class Builder {
    public abstract void setGPS(String gps);
    public abstract void setSeats(int seats);
    public abstract void setEngine(String engine);
    public abstract void setWheels(int wheels);
    public abstract void setTransmission(String transmission);
    public abstract void setCarType(CarType cartype);
}
