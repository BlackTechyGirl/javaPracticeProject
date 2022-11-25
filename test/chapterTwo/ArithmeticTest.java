package chapterTwo;

import first.Arithmetic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    Arithmetic arithmetic;
    @BeforeEach
    public void setUp(){
        arithmetic = new Arithmetic();
    }
//    @Test
//    public void userCanEnterTwoNumbers(){
//        arithmetic = new Arithmetic();
//        assertEquals(0, arithmetic.setFirstNumber(0.0));
//        assertEquals(0, arithmetic.setSecondNumber());
//
//    }
    @Test
    public void obtainTwoNumbersFromTheUser(){
        arithmetic = new Arithmetic();
        assertEquals(2.4, arithmetic.getFirstNumber());
        assertEquals(2.5, arithmetic.getSecondNumber());
    }
}
