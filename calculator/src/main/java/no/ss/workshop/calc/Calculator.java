package no.ss.workshop.calc;

import no.ss.printer.Printer;
import no.ss.util.MathUtil;
import no.ss.util.math.Operations;

import java.math.BigDecimal;

public class Calculator {

    public static void calculate(Operations operation, BigDecimal a, BigDecimal b) {
        Printer printer = new Printer();
        MathUtil mathUtil = new MathUtil();
        printer.println(a + " " + operation.getOperator() + " " + b + " => " + mathUtil.doMath(operation, a, b));
    }
}
