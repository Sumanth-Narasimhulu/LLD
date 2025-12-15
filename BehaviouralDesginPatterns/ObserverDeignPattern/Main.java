package BehaviouralDesginPatterns.ObserverDeignPattern;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel("Java");
        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");
        youtubeChannel.registerObserver(subscriber1);
        youtubeChannel.registerObserver(subscriber2);
        youtubeChannel.notifyObservers("Design Patterns in Java - Observer Pattern");
    }
}
