package ObserverDesignPattern;
public class ObserverDesignPattern {
    public static void main(String[] args) {
        ConcreteChannel channel = new ConcreteChannel("CoderArmy");

        ConcreteSubscriber subs1 = new ConcreteSubscriber("Varun", channel);
        ConcreteSubscriber subs2 = new ConcreteSubscriber("Tarun", channel);

        channel.subscribe(subs1);
        channel.subscribe(subs2);
        channel.uploadVedio("Observer Pattern Tutorial");
        channel.unsubscribe(subs1);
        channel.uploadVedio("Decorator Pattern Tutorial");
    }
}