package StructuralDesignPatterns.DecaratorDesignPattern.CoffeeMaking;

public class SimpleCoffee implements Coffee {

    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }



}
