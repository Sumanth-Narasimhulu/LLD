package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public class PlaceOrderState implements OrderState {
    private Order order;
    public PlaceOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void placeOrder() {
        System.out.println("Placed Order");

    }

    @Override
    public void makePayment() {
        System.out.println("Making Payment");
        order.setState(order.getMakePaymentState());

    }

    @Override
    public void shipOrder() {
        System.out.println("make payment initially");

    }

    @Override
    public void deliveryOrder() {
        System.out.println("Make Payment initially");

    }

    @Override
    public void cancelOrder() {
        System.out.println("Canceling Order");
        order.setState(order.getCancelOrderState());

    }
}
