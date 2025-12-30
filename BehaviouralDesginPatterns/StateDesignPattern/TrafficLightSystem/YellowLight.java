package BehaviouralDesginPatterns.StateDesignPattern.TrafficLightSystem;

public class YellowLight implements TrafficLightState {
    public void handleTrafficLight() {
        System.out.println("Traffic light is yellow");
    }
}
