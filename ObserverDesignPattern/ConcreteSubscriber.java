package ObserverDesignPattern;

public class ConcreteSubscriber implements ISubscriber{
    private String name;
    private ConcreteChannel channel;
    public ConcreteSubscriber(String name, ConcreteChannel channel){
        this.name = name;
        this.channel = channel;
    }
    @Override
    public void update(){
        System.out.println("Hi " + this.name + " new vedio has been uploaded to " + this.channel.getName() + " the vedio is " + this.channel.getVideoData());
    }

}
