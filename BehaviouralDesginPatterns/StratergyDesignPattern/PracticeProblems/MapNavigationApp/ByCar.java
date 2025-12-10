package BehaviouralDesginPatterns.StratergyDesignPattern.PracticeProblems.MapNavigationApp;

public class ByCar implements TravelStratergy {
    public void calculateRoute(String from, String to){
        System.out.println("Calculating route by Car from " + from + "to " + to +"....\n Estimated time : 30mins");
    }
    
}
