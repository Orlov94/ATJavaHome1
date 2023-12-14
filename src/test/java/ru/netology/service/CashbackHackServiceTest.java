package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldByeForBonus() {

        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);

    }
    @Test
    public void noShouldByeForBonus() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);

    }
    @Test
    public void shouldByeManyForBonus() {

        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1100);

        assertEquals(expected, actual);

    }
}