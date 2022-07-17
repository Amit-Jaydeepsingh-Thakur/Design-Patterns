package main.java.com.amit.design_patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        this.instance = null;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
