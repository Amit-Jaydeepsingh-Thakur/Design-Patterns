package main.java.com.amit.design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 + "\n" + s2);
    }
}
