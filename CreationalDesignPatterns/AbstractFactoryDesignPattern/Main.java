package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory bmwFactory = new BMWFactory();
        Vehicle BMW = bmwFactory.createVehicle();
        BMW.start();
        BMW.stop(); 

        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle Honda = hondaFactory.createVehicle();
        Honda.start();
        Honda.stop();

        VehicleFactory suzukiFactory = new SuzukiFactory();
        Vehicle Suzuki = suzukiFactory.createVehicle();
        Suzuki.start();         
        Suzuki.stop();
    }
}
