package com.onfleek.patterns.strategy;

import java.math.BigDecimal;

public interface Discounter {

    public BigDecimal applyDiscount(BigDecimal amount);

}
