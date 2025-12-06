package CreationalDesignPatterns.BuilderDesginPattern;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car1 = builder.setColor("Red")
                          .setWheels(4)
                          .setPowerSteering(true)
                          .setSeats(5)
                          .setAirBags(true)
                          .build();
        System.out.println(car1);

        Car car2 = builder.setColor("Blue")
                          .setWheels(4)
                          .setPowerSteering(false)
                          .setSeats(4)
                          .setAirBags(false)
                          .build();
        System.out.println(car2);
    }
}
