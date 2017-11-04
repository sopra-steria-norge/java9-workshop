package no.ss.workshop;

import no.ss.util.MathUtil;
import no.ss.workshop.calc.Calculator;
import no.ss.workshop.http2.HttpTest;

import java.math.BigDecimal;


public class RunMe {

    public static void main(String[] args) {
        Calculator.calculate(MathUtil.add(), BigDecimal.TEN, BigDecimal.TEN);
        Calculator.calculate(MathUtil.multiply(), BigDecimal.TEN, BigDecimal.TEN);

        HttpTest.tryVg();
    }
}
