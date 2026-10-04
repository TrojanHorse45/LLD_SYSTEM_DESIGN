package talk;

import strategies.Talkable;

public class NormalTalk implements Talkable {

    @Override
    public void talk() {
        System.out.println("Robot can talk normally");
    }
}