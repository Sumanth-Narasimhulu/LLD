package BehaviouralDesginPatterns.StratergyDesignPattern.PracticeProblems.MapNavigationApp;

public class ByWalk implements TravelStratergy {
    public void calculateRoute(String from, String to){
        System.out.println("Calculating route by Walk from " + from + "to " + to +"....\n Estimated time : 3hours");
    }
    
}
