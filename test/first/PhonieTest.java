package first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonieTest {
    Phonie phonie;

    @BeforeEach
    @Test
    void setUp() {
        phonie = new Phonie();
    }
    @Test
    void testThatWeCanCheckMtn(){
        assertTrue(Phonie.checkMtn("0803"));
    }
    @Test
    void testThatWeCanCheckAirtel(){
        assertTrue(Phonie.checkAirtel("0708"));
    }
    @Test
    void testThatWeCanCheckGlo(){
        assertTrue(Phonie.checkGlo("0705"));
    }
    @Test
    void testThatWeCanCheck9mobile(){
        assertTrue(Phonie.check9mobile("0909"));
    }

}