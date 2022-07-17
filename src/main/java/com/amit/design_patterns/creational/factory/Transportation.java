package main.java.com.amit.design_patterns.creational.factory;

public abstract class Transportation {
    public void transportGoods() {
        System.out.println("Transporting the Goods");
    }
    public abstract Vehicle transportMedia();
}
