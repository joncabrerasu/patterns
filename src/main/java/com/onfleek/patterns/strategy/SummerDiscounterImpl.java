package com.onfleek.patterns.strategy;

import java.math.BigDecimal;

public class SummerDiscounterImpl implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        // In summer seanson we apply a 60% discount
        return amount.multiply(BigDecimal.valueOf(0.4));
    }
}
