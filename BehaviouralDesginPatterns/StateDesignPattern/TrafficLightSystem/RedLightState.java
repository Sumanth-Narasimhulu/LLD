package BehaviouralDesginPatterns.StateDesignPattern.TrafficLightSystem;

import java.net.StandardSocketOptions;

public class RedLightState implements TrafficLightState {
    public void handleTrafficLight() {
        System.out.println("Traffic light is red");

    }
}
