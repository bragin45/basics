package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1000, service.remain(0));
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


}