package BehaviouralDesginPatterns.StateDesignPattern.PracticeProblems.OrderFlow;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.placeOrder();
        order.makePayment();
        order.shipOrder();
        order.cancelOrder();

        System.out.println("============");

        Order order2 = new Order();
        order2.placeOrder();
        order2.makePayment();
        order2.shipOrder();
        order2.deliveryOrder();
        order2.cancelOrder();

    }
}
