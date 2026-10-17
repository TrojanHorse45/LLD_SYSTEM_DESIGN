package ObserverDesignPattern;

import java.util.*;

public class ConcreteChannel implements IChannel {
    private String name;
    ArrayList<ISubscriber> subscribers;
    String latestVedio;
    public ConcreteChannel(String name){
        this.name = name;
        this.subscribers = new ArrayList<>();
    }
    @Override
    public void subscribe(ISubscriber subscriber){
        subscribers.add(subscriber);
    }
    @Override
    public void unsubscribe(ISubscriber subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(){
        for(ISubscriber subscriber : subscribers){
            subscriber.update();
        }
    }
    public void uploadVedio(String vedio){
        this.latestVedio = vedio;
        System.out.println("\n[" + this.name + " uploaded \"" + this.latestVedio + "\"]");
        notifySubscribers();
    }
    public String getVideoData() {
        return "\nCheckout our new Video : " + this.latestVedio + "\n";
    }
    public String getName(){
        return this.name;
    }
}
