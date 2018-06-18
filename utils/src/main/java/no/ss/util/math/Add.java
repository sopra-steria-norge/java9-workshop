package no.ss.util.math;

import java.math.BigDecimal;

public class Add implements Operation {
    @Override
    public BigDecimal doIt(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
