package main.java.com.amit.design_patterns.structural.adpater;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern");

        Movable buggati = new Buggati();
        MovableAdapterImplementation adpater = new MovableAdapterImplementation(buggati);

        System.out.println("The converted speeed" + " " + adpater.getConvertedSpeed());
    }
}
