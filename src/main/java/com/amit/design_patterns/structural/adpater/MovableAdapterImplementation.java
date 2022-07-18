package main.java.com.amit.design_patterns.structural.adpater;

public class MovableAdapterImplementation implements MovableAdapter {

    private Movable luxuryCars;

    public MovableAdapterImplementation(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getConvertedSpeed() {
        int mph = luxuryCars.getSpeed();
        return mph * 1.60934;
    }
}
