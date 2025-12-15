package BehaviouralDesginPatterns.ObserverDeignPattern;

public class Subscriber implements Observer{
    private String subscriberName;
    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    @Override
    public void update(String message) {
        System.out.println("Hey " + subscriberName + ", New video uploaded: " + message);
    }
}
