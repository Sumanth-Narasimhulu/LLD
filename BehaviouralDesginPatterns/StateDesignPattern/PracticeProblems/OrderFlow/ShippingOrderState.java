package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public class ShippingOrderState implements OrderState {
    private Order order;
    public ShippingOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void placeOrder() {
        System.out.println("Placed Order");


    }

    @Override
    public void makePayment() {
      System.out.println(" Payment completed");
    }

    @Override
    public void shipOrder() {
        System.out.println("Shipped Order");

    }

    @Override
    public void deliveryOrder() {
        System.out.println("Delivered Order");
        order.setState(order.getDeliveryOrderState());

    }

    @Override
    public void cancelOrder() {
        System.out.println("not possible ,because Order already shipped");

    }
}
