package main.java.com.amit.design_patterns.structural.decorator.coffee_machine;

public class PlainCoffee extends CoffeeDecorator {

    public PlainCoffee(Coffee cd) {
        super(cd);
    }

    @Override
    public double getCost() {
        return super.getCost() + 30.00d;
    }

    @Override
    public void getIngredients() {
        System.out.println("The ingredients are plain milk");
        super.getIngredients();
    }
}
