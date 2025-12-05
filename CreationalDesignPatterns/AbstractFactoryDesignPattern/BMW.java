package CreationalDesignPatterns.AbstractFactoryDesignPattern;


public class BMW implements Vehicle {
    @Override
    public void start() {
        System.out.println("BMW started");
    }

    @Override
    public void stop() {
        System.out.println("BMW stopped");
    }
    
}
