package AbstractFactoryDesignPattern;

public class SuzukiFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Suzuki();
    }
    
}
