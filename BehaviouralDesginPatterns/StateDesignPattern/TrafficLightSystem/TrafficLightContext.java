package BehaviouralDesginPatterns.StateDesignPattern.TrafficLightSystem;

public class TrafficLightContext {
    private TrafficLightState trafficLightState;
    public TrafficLightContext() {

    }
    public TrafficLightState getTrafficLightState() {
        return trafficLightState;
    }
    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;

    }
    public void handleTrafficLight() {
        trafficLightState.handleTrafficLight();
    }
}
