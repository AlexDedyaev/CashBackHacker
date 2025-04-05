package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ifAmount900() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void ifAmount0() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void ifAmount4500() {
        assertEquals(service.remain(4500), 500);
    }

}