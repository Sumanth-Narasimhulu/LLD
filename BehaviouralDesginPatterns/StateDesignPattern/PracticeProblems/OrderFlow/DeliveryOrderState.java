package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public class DeliveryOrderState implements OrderState {
    private Order order;
    public DeliveryOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void placeOrder() {
        System.out.println("order placed ");

    }

    @Override
    public void makePayment() {

        System.out.println(" payment successful");

    }

    @Override
    public void shipOrder() {
        System.out.println("order shipped");

    }

    @Override
    public void deliveryOrder() {
        System.out.println("order delivered");

    }

    @Override
    public void cancelOrder() {
        System.out.println("order  can't cancel because order is already delivered");

    }
}
