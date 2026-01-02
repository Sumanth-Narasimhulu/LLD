package StructuralDesignPatterns.DecaratorDesignPattern.CoffeeMaking;

public class MilkDecorator extends CoffeeDecarator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" Milk added";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 1.0;
    }
}
