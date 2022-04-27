package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }


    @Test
    public void shouldCalculateCashback200() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(200);
        int expected = 800;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateCashback400() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateCashback1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateCashback1200() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1200);
        int expected = 800;
        assertEquals(expected,actual);
    }

}