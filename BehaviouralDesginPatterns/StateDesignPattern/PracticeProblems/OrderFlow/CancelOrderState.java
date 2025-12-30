package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public class CancelOrderState implements OrderState {
    private Order order;
    public CancelOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void placeOrder() {
        System.out.println("order cancelled");

    }

    @Override
    public void makePayment() {
        System.out.println("order cancelled");

    }

    @Override
    public void shipOrder() {
        System.out.println("order cancelled");

    }

    @Override
    public void deliveryOrder() {
        System.out.println("order cancelled");

    }

    @Override
    public void cancelOrder() {
        System.out.println("order cancelled already");
    }
}
