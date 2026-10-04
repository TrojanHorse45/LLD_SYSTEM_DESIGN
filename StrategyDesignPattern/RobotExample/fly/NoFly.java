package fly;

import strategies.Flyable;

public class NoFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("Robot cannot fly");
    }
}