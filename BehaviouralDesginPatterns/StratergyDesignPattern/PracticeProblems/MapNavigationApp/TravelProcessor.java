package BehaviouralDesginPatterns.StratergyDesignPattern.PracticeProblems.MapNavigationApp;

public class TravelProcessor {
    private TravelStratergy travelStratergy;
    public TravelProcessor(TravelStratergy travelStratergy) {
        this.travelStratergy = travelStratergy;
    }
    public void executeTravel(String from , String to) {
        travelStratergy.calculateRoute(from , to);
    }
    public void setTravelStratergy(TravelStratergy travelStratergy) {
        this.travelStratergy = travelStratergy;
    }
    
}
