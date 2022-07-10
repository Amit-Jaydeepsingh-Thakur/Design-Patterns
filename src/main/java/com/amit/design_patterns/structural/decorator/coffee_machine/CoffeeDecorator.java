package main.java.com.amit.design_patterns.structural.decorator.coffee_machine;

public class CoffeeDecorator extends Coffee {

    private final Coffee cd;

    public CoffeeDecorator(Coffee cd) {
        this.cd = cd;
    }

    @Override
    public double getCost() {
        return cd.getCost();
    }

    @Override
    public void getIngredients() {
        return;
    }
}
