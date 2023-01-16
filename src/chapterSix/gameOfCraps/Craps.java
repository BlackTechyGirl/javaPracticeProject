package chapterSix.gameOfCraps;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom random = new SecureRandom();;

    public static int rollDice(){
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        return die1 + die2;
    }

    public void die() {

    }
}
