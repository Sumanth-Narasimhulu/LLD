package BehaviouralDesginPatterns.StratergyDesignPattern;

public class CreditCardPayment implements PayementStratergy {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
    
}
