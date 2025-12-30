package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public class MakePaymentState implements OrderState {
    private Order order;
    public MakePaymentState(Order order) {
        this.order = order;
    }

    @Override
    public void placeOrder() {
        System.out.println("Placed Order");

    }

    @Override
    public void makePayment() {
        System.out.println("Payment Successful");

    }

    @Override
    public void shipOrder() {

        System.out.println("shipped  Order");
        order.setState(order.getShippingOrderState());

    }

    @Override
    public void deliveryOrder() {
        System.out.println("order not yet shipped ");


    }

    @Override
    public void cancelOrder() {
        System.out.println("order cancelled ");
        order.setState(order.getCancelOrderState());
    }
}
