package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testThatWeCanGetName(){
        Account account = new Account("Martha", 500);
        String name = account.getName();
        assertEquals("Martha", name);
    }
}
