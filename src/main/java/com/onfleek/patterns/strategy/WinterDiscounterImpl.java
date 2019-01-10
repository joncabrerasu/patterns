package com.onfleek.patterns.strategy;

import java.math.BigDecimal;

public class WinterDiscounterImpl implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        // In winter season we apply a 80% discount
        return amount.multiply(BigDecimal.valueOf(0.2));
    }
}
