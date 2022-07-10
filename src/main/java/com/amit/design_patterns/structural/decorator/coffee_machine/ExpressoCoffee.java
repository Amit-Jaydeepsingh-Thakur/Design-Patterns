package main.java.com.amit.design_patterns.structural.decorator.coffee_machine;

public class ExpressoCoffee extends CoffeeDecorator {

    public ExpressoCoffee(Coffee cd) {
        super(cd);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.1;
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
    }
}
