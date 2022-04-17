package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 1000);
    }

    @Test
    public void shouldCalculateCashback500() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1500), 500);
    }

    @Test
    public void shouldCalculateCashback800() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1200), 800);
    }

}