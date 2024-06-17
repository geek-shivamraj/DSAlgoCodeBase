package com.springboot.concept.solidPrinciple.dependencyInversion;

import com.springboot.concept.solidPrinciple.dependencyInversion.model.Shape;

import java.util.List;

public class ShapesPrinter {

    // Instead of using the concreate class AreaCalculator,
    // We can use interface IAreaCalculator & use dependency injection.
//    private AreaCalculator areaCalculator = new AreaCalculator();

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum, %s".formatted(areaCalculator.sum(shapes));
    }
}
