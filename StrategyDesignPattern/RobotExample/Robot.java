import strategies.Flyable;
import strategies.Talkable;
import strategies.Walkable;
public abstract class Robot{
    Talkable talkBehaviour;
    Walkable walkBehaviour;
    Flyable flybehaviour;
    public Robot(
        Talkable talkBehavior,
        Walkable walkBehavior,
        Flyable flyBehavior
    ){
        this.talkBehaviour = talkBehavior; 
        this.walkBehaviour = walkBehavior;
        this.flybehaviour = flyBehavior;
    }
    public void talk(){
        talkBehaviour.talk();
    }
    public void walk(){
        walkBehaviour.walk();
    }
    public void fly(){
        flybehaviour.fly();
    }
    public abstract void projection();
}