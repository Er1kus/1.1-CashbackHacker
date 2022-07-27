package ru.netology.service;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTestApi {

    CashbackHackService serv = new CashbackHackService();

    @Test
    public void shouldCalcMinCashback() {
        int amount = 999;
        int actual = serv.remain(amount);
        int expected = 1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcMaxCashback() {
        int amount = 1;
        int actual = serv.remain(amount);
        int expected = 999;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldCalcNoCashback() {
        int amount = 1000;
        int actual = serv.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected,actual);

    }
}