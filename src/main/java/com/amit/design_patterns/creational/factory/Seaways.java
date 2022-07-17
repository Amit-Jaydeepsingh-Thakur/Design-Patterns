package main.java.com.amit.design_patterns.creational.factory;

public class Seaways extends Transportation {

    @Override
    public Vehicle transportMedia() {
        return new Ship();
    }
}
