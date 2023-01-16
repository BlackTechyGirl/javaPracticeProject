package gameOfCraps;

import chapterSix.gameOfCraps.Craps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrapsTest {
    private Craps craps;
    private Craps setdice;

    @BeforeEach
    public void setUp() {
        craps = new Craps();
//        dice = new Craps();
    }

    @Test
    public void testThatDieExist() {
        craps.die();
//        assertNotNull();
    }
    @Test
    public void testThatPlayerCanRollADce() {

    }
}
