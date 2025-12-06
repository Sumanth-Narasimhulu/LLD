package CreationalDesignPatterns.BuilderDesginPattern;

public class Car {
    private String color;
    private int wheels;
    private boolean powerSteering;
    private int seats;
    private boolean airBags;
    public Car(CarBuilder builder){
        this.color = builder.color;
        this.wheels = builder.wheels;
        this.powerSteering = builder.powerSteering;
        this.seats = builder.seats;
        this.airBags = builder.airBags;
    }
    public String getColor() {
        return color;
    }   
    public int getWheels() {
        return wheels;
    }
    public boolean isPowerSteering() {
        return powerSteering;   
    }
    public int getSeats() {
        return seats;
    }
    public boolean isAirBags() {
        return airBags; 
    }
    public String toString(){
        return "Car [color=" + color + ", wheels=" + wheels + ", powerSteering=" + powerSteering + ", seats=" + seats + ", airBags=" + airBags + "]";
    }   


    static class CarBuilder{
        private String color = "white";
        private int wheels = 4;
        private boolean powerSteering = false;
        private int seats = 4;
        private boolean airBags = false;    

        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public CarBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }
        public CarBuilder setPowerSteering(boolean powerSteering){
            this.powerSteering = powerSteering;
            return this;
        }
        public CarBuilder setSeats(int seats){
            this.seats = seats;
            return this;    
        }
        public CarBuilder setAirBags(boolean airBags){
            this.airBags = airBags;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

}
