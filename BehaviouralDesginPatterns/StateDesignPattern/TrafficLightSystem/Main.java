package BehaviouralDesginPatterns.StateDesignPattern.TrafficLightSystem;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();
        trafficLight.setTrafficLightState(new RedLightState());
        trafficLight.handleTrafficLight();
        trafficLight.setTrafficLightState(new OrangeLight());
        trafficLight.handleTrafficLight();
        trafficLight.setTrafficLightState(new YellowLight());
        trafficLight.handleTrafficLight();

    }
}
