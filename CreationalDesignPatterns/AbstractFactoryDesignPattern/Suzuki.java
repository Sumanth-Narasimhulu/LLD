package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class Suzuki implements Vehicle {
    @Override
    public void start() {
        System.out.println("Suzuki started");
    }

    @Override
    public void stop() {
        System.out.println("Suzuki stopped");
    }
    
}
