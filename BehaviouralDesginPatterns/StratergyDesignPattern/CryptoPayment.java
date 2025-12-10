package BehaviouralDesginPatterns.StratergyDesignPattern;

public class CryptoPayment implements PayementStratergy {
    @Override
    public void processPayment() {
        System.out.println("Processing crypto payment...");
    }
    
}
