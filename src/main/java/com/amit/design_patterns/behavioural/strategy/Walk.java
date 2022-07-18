package main.java.com.amit.design_patterns.behavioural.strategy;

public class Walk implements Route {

    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Walk");
        System.out.println("Building the route from " + source + "to" + destination);
        return;
    }
}
