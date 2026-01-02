package StructuralDesignPatterns.DecaratorDesignPattern.CoffeeMaking;
//Decorator pattern lets us add behavior to an object without modifying its class.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() +" price " + coffee.getPrice());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() +" price " + coffee.getPrice());
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() +" price " + coffee.getPrice());

    }
}
