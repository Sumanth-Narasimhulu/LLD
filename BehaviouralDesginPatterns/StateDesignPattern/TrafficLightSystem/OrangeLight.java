package BehaviouralDesginPatterns.StateDesignPattern.TrafficLightSystem;

public class OrangeLight implements TrafficLightState {
    public void handleTrafficLight() {
        System.out.println("Traffic light is orange");
    }
}
