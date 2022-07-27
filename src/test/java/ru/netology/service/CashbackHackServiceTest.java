package ru.netology.service;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService serv = new CashbackHackService();

    @Test
    public void shouldCalcMinCashback() {
        int amount = 999;
        int actual = serv.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcMaxCashback() {
        int amount = 1;
        int actual = serv.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalcNoCashback() {
        int amount = 1000;
        int actual = serv.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }
}