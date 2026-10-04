package walk;

import strategies.Walkable;

public class NormalWalk implements Walkable {

    @Override
    public void walk() {
        System.out.println("Robot can walk normally");
    }
}