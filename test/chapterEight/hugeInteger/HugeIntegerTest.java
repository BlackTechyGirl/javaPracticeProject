package chapterEight.hugeInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {
    HugeInteger hugeInteger;

    @BeforeEach
    @Test
    void setUp() {
        hugeInteger = new HugeInteger();
    }
    @Test
    public void parseTest() {
        String number = "5364";
        hugeInteger.parse(number);
        int[] array = hugeInteger.getDigitArray();
        assertEquals(5, array[0]);
        assertEquals(3, array[1]);
        assertEquals(6, array[2]);
        assertEquals(4, array[3]);
    }

    @Test
    public void isEqualTest() {
        int num1 = 2;
        int num2 = 2;
        assertTrue(hugeInteger.isEqualTo(num1, num2));
    }

    @Test
    public void isNotEqualTest() {
        int num1 = 2;
        int num2 = 3;
        assertTrue(hugeInteger.isNotEqualTo(num1, num2));
    }

    @Test
    public void isGreaterThanTest() {
        int num1 = 3;
        int num2 = 2;
        assertTrue(hugeInteger.isGreaterThan(num1, num2));
    }

    @Test
    public void isLessThanTest() {
        int num1 = 2;
        int num2 = 3;
        assertTrue(hugeInteger.isLessThan(num1, num2));
    }

    @Test
    public void isGreaterThanOrEqualToTest() {
        int num1 = 2;
        int num2 = 2;
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(num1, num2));

        num1 = 7;
        num2 = 3;
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(num1, num2));
    }

    @Test
    public void isLessThanOrEqualToTest() {
        int num1 = 2;
        int num2 = 2;
        assertTrue(hugeInteger.isLessThanOrEqualTo(num1, num2));

        num1 = 3;
        num2 = 10;
        assertTrue(hugeInteger.isLessThanOrEqualTo(num1, num2));
    }

    @Test
    public void isZeroTest() {
        int num = 0;
        assertTrue(hugeInteger.isZero(num));
    }

    @Test
    public void toStringTest() {
        int num = 5;
        assertEquals("5", hugeInteger.toString(num));
    }

    @Test
    public void toStringTest2() {
        String number = "235";
        hugeInteger.parse(number);
        assertEquals(number, hugeInteger.toString());
    }

    @Test
    public void addNumberTest() {
        int num1 = 4;
        int num2 = 7;
        assertEquals(11, hugeInteger.add(num1, num2));
    }


    @Test
    public void subtractNumberTest() {
        int num1 = 8;
        int num2 = 3;
        assertEquals(5, hugeInteger.subtract(num1, num2));
    }

    @Test
    public void setNumberTest() {
        hugeInteger.setNumber(247);
        int[] array = hugeInteger.getDigitArray();
        assertEquals(2, array[0]);
        assertEquals(4, array[1]);
        assertEquals(7, array[2]);
    }

    @Test
    public void getNumberTest() {
        hugeInteger.setNumber(348);
        assertEquals(348, hugeInteger.getNumber());
    }
}