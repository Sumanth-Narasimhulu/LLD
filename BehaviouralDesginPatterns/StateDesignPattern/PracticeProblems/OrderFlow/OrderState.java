package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public interface OrderState {
    void placeOrder();
    void makePayment();
    void shipOrder();
    void deliveryOrder();
    void cancelOrder();
}
