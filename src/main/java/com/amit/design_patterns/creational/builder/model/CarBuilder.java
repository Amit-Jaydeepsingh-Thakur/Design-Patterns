package main.java.com.amit.design_patterns.creational.builder.model;

public class CarBuilder extends Builder {
    private String gps;
    private int seats;
    private String engine;
    private String transmission;
    private int wheels;
    private CarType cartype;

    public String getGps() {
        return gps;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public void setGPS(String gps) {
        this.gps = gps;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setCarType(CarType cartype) {
        this.cartype = cartype;
    }

    public void getResult() {
        System.out.println("The car specifications are :-");
        System.out.println("Engine" + " " + this.engine);
        System.out.println("Wheels" + " " + this.wheels);
        System.out.println("Transmission" + " " + this.transmission);
        System.out.println("GPS" + " " + this.gps);
        System.out.println("Seats" + " " + this.seats);
        System.out.println("CarType" + " " + this.cartype);
    }
}
