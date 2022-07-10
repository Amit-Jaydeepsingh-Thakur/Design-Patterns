package main.java.com.amit.design_patterns.structural.decorator.coffee_machine;

public class FilterCoffee extends CoffeeDecorator {

    public FilterCoffee(CoffeeDecorator cd) {
        super(cd);
    }

    @Override
    public double getCost() {
        return super.getCost() + 40.00d;
    }

    @Override
    public void getIngredients() {
        System.out.println("The ingredients are filter coffee");
        super.getIngredients();
    }
}
