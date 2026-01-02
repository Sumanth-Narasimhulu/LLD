package StructuralDesignPatterns.DecaratorDesignPattern.CoffeeMaking;

public class SugarDecorator extends CoffeeDecarator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);

    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " sugar added";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 1.0;
    }


}
