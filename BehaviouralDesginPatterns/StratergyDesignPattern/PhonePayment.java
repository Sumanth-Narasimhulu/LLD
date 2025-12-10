package BehaviouralDesginPatterns.StratergyDesignPattern;

public class PhonePayment implements PayementStratergy {
    @Override
    public void processPayment() {
        System.out.println("Processing phone payment...");
    }
    
}
