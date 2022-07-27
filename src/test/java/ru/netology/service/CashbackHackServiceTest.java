package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService serv = new CashbackHackService();

    @Test
    public void shouldCalcMinCashback() {
        int amount = 999;
        int actual = serv.remain(amount);
        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcMaxCashback() {
        int amount = 1;
        int actual = serv.remain(amount);
        int expected = 999;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldCalcNoCashback() {
        int amount = 1000;
        int actual = serv.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);

    }
}