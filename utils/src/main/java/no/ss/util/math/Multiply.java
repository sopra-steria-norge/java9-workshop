package no.ss.util.math;

import java.math.BigDecimal;

public class Multiply implements Operation {
    @Override
    public BigDecimal doIt(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
