package main.java.com.amit.design_patterns.structural.decorator.coffee_machine;

public class CreamCoffee extends Coffee {

    @Override
    public double getCost() {
        return super.getCost()+ 10.1d;
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
    }
}
