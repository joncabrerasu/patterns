package com.onfleek.patterns.strategy;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class DiscounterTest {

    @Test
    public void winterDiscountTest() {
        Discounter discounter = new WinterDiscounterImpl();

        BigDecimal normalPrice = BigDecimal.valueOf(100);
        BigDecimal winterPrice = discounter.applyDiscount(normalPrice);
        assertEquals(BigDecimal.valueOf(20.0), winterPrice);
    }

    @Test
    public void summerDiscountTest() {
        Discounter discounter = new SummerDiscounterImpl();

        BigDecimal normalPrice = BigDecimal.valueOf(100);
        BigDecimal summerPrice = discounter.applyDiscount(normalPrice);
        assertEquals(BigDecimal.valueOf(40.0), summerPrice);
    }

}