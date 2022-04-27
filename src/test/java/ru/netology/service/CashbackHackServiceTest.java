package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldCalculateCashback200() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(200, service.remain(800));
    }

    @Test
    public void shouldCalculateCashback400() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(400, service.remain(600));
    }

    @Test
    public void shouldCalculateCashback1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1000, service.remain(1000));
    }

    @Test
    public void shouldCalculateCashback1200() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(800, service.remain(1200));
    }


}