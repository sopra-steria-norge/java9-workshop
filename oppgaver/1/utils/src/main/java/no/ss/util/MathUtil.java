package no.ss.util;

import no.ss.util.math.*;

import java.math.BigDecimal;

public class MathUtil {

    private BigDecimal add(BigDecimal a, BigDecimal b) {
        return new Add().doIt(a, b);
    }

    private BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return new Multiply().doIt(a, b);
    }

    private BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return new Subtract().doIt(a, b);
    }

    private BigDecimal divide(BigDecimal a, BigDecimal b) {
        return new Divide().doIt(a, b);
    }

    public BigDecimal doMath(Operations operation, BigDecimal a, BigDecimal b) {
        switch (operation) {
            case ADD:
                return add(a, b);
            case MULTIPLY:
                return multiply(a, b);
            case SUBTRACT:
                return subtract(a, b);
            case DIVIDE:
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Ukjent operation");
        }
    }

    public static Operations add() {
        return Operations.ADD;
    }

    public static Operations subtract() {
        return Operations.SUBTRACT;
    }

    public static Operations multiply() {
        return Operations.MULTIPLY;
    }

    public static Operations divide() {
        return Operations.DIVIDE;
    }
}
