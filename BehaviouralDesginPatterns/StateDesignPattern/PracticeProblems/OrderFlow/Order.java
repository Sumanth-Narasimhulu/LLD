package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public class Order {
    private OrderState currentState;
    private OrderState placeOrderState;
    private OrderState makePaymentState;
    private OrderState ShippingOrderState;
    private OrderState deliveryOrderState;
    private OrderState cancelOrderState;
    public Order(){
        this.placeOrderState = new PlaceOrderState(this);
        this.makePaymentState = new MakePaymentState(this);
        this.deliveryOrderState = new DeliveryOrderState(this);
        this.cancelOrderState = new CancelOrderState(this);
        this.ShippingOrderState = new ShippingOrderState(this);
        currentState = placeOrderState;

    }

    public void cancelOrder() {
        currentState.cancelOrder();
    }

    public void placeOrder() {
        currentState.placeOrder();
    }

    public void makePayment() {
        currentState.makePayment();
    }

    public void shipOrder() {
        currentState.shipOrder();
    }

    public void deliveryOrder() {
        currentState.deliveryOrder();
    }

    public void setState(OrderState orderState){
        this.currentState = orderState;
    }

    public OrderState getCancelOrderState() {
        return cancelOrderState;
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    public OrderState getDeliveryOrderState() {
        return deliveryOrderState;
    }

    public OrderState getMakePaymentState() {
        return makePaymentState;
    }

    public OrderState getPlaceOrderState() {
        return placeOrderState;
    }

    public OrderState getShippingOrderState() {
        return ShippingOrderState;
    }
}
