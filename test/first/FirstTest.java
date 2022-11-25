package first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    @Test
    public void test(){
        First first = new First();
        first.setHelloWorld("Hello World");
        assertEquals("Hello World", first.getHelloWorld());
    }
}
