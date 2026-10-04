package walk;

import strategies.Walkable;

public class NoWalk implements Walkable {

    @Override
    public void walk() {
        System.out.println("Robot cannot walk");
    }
}