package com.springboot.concept.solidPrinciple.openClosed;

public class ShapesPrinter {

    public String json(int sum) {
        return "{sum: %s}".formatted(sum);
    }

    public String csv(int sum) {
        return "sum, %s".formatted(sum);
    }
}
