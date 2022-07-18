package main.java.com.amit.design_patterns.behavioural.strategy;

public class Cycle implements Route {

    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Cycle");
        System.out.println("Building the route from " + source + "to" + destination);
        return;
    }
}
