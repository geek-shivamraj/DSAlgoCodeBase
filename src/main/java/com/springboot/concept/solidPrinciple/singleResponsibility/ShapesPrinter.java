package com.springboot.concept.solidPrinciple.singleResponsibility;

public class ShapesPrinter {

    public String json(int sum) {
        return "{sum: %s}".formatted(sum);
    }

    public String csv(int sum) {
        return "sum, %s".formatted(sum);
    }
}
