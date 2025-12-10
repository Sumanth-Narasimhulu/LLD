package BehaviouralDesginPatterns.StratergyDesignPattern.PracticeProblems.MapNavigationApp;

public class Main {
    public static void main(String[] args) {
        TravelStratergy byCar = new ByCar();
        TravelStratergy byBike = new ByBike();
        TravelStratergy byWalk = new ByWalk();
        TravelProcessor processor = new TravelProcessor( byCar );
        processor.executeTravel("Home" , "Office");
        processor.setTravelStratergy(byBike);
        processor.executeTravel("Home" , "Office");

        processor.setTravelStratergy(byWalk);
        processor.executeTravel("Home" , "Office");
    }
}
