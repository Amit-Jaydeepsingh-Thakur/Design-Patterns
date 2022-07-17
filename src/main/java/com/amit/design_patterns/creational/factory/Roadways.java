package main.java.com.amit.design_patterns.creational.factory;

public class Roadways extends Transportation {

    @Override
    public Vehicle transportMedia() {
        return new Truck();
    }
}
