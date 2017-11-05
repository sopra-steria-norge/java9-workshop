package no.ss.util.math;

public enum Operations {
    ADD("+"), MULTIPLY("*"), SUBTRACT("-"), DIVIDE("/");
    private String operator;

    Operations(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
