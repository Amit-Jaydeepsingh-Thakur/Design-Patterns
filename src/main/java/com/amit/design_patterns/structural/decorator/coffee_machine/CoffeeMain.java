package main.java.com.amit.design_patterns.structural.decorator.coffee_machine;

public class CoffeeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Coffee Machine");

        CreamCoffee cream_coffee = new CreamCoffee();
        Coffee c = new PlainCoffee(cream_coffee);
        System.out.println(c.getCost());
        c = new ExpressoCoffee(c);

        System.out.println(c.getCost());

    }
}
