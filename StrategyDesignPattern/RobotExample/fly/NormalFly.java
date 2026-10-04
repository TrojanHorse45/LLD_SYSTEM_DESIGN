package fly;

import strategies.Flyable;

public class NormalFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("Robot can fly");
    }
}