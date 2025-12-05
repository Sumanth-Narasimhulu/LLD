package FactoryDesignPattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();
        car.stop();

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.start();
        truck.stop();
    }
    
}
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car started");
    }
    @Override
    public void stop(){
    
        System.out.println("Car stopped");
    }
}

class Truck implements Vehicle{
    @Override
    public void start(){
        System.out.println("Truck started");
    }
    @Override
    public void stop(){
        System.out.println("Truck stopped");
    }
}

class VehicleFactory{
    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        }else if(type.equalsIgnoreCase("truck")){
            return new Truck();
        }
        return null;
    }
}
