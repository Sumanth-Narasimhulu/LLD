package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class HondaFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
    
}
