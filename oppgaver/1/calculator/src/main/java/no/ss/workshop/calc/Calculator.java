package no.ss.workshop.calc;

import no.ss.util.MathUtil;
import no.ss.util.math.Operations;

import java.math.BigDecimal;

public class Calculator {

    public static void calculate(Operations operation, BigDecimal a, BigDecimal b) {
        MathUtil mathUtil = new MathUtil();
        System.out.println(a + " " + operation.getOperator() + " " + b + " => " + mathUtil.doMath(operation, a, b));
    }
}
