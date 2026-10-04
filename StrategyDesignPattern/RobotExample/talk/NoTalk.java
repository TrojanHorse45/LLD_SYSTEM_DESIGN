package talk;

import strategies.Talkable;

public class NoTalk implements Talkable {

    @Override
    public void talk() {
        System.out.println("This robot cannot talk");
    }
}