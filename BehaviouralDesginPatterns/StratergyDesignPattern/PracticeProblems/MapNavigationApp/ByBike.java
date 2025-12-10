package BehaviouralDesginPatterns.StratergyDesignPattern.PracticeProblems.MapNavigationApp;

public class ByBike implements TravelStratergy {
    public void calculateRoute(String from, String to){
        System.out.println("Calculating route by Bike from " + from + "to " + to +"....\n Estimated time : 1hour");
    }
    
}
