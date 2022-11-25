package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp(){
        account = new Account("Martha");
    }
    @Test
    public void weCanGetName(){
        assertEquals(account.getUsername(), "Martha");
    }
    @Test
    public  void depositMoney(){
        int deposit = account.depositMoney();
        assertEquals(deposit, );
    }
}
