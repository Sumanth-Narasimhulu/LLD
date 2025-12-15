package BehaviouralDesginPatterns.ObserverDeignPattern;

import java.util.List;

public class YoutubeChannel implements Subject{

    private List<Observer>observers;
    private String channelName;
    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        this.observers = new java.util.ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String message) {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }
} 
