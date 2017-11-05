package no.ss.util.math;

import java.math.BigDecimal;

public interface Operation {
    default BigDecimal doIt(BigDecimal a, BigDecimal b) {
        throw throwIt();
    }

    default BigDecimal dontDoIt(BigDecimal a, BigDecimal b) {
        throw throwIt();
    }

    private IllegalStateException throwIt() {
        return new IllegalStateException("Usupportert operation");
    }
}
