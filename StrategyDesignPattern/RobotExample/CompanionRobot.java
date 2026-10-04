import talk.NormalTalk;
import walk.NormalWalk;
import fly.NoFly;

public class CompanionRobot extends Robot {

    public CompanionRobot() {
        super(
            new NormalTalk(),
            new NormalWalk(),
            new NoFly()
        );
    }

    @Override
    public void projection() {
        System.out.println("I am a companion robot");
    }
}