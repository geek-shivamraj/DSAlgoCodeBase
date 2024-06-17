package com.springboot.concept.solidPrinciple.dependencyInversion;

import com.springboot.concept.solidPrinciple.dependencyInversion.model.Shape;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    public int sum(List<Shape> shapes) {
        int sum = 0;
        for(int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();
        }
        return sum;
    }
    // Instead of filling this class with excessive functionality,
    // we can create a new class as ShapesPrinter that can be used for
    // multiple shapes.
    /*
    public String json(List<Object> shapes) {
        return "{sum: %s}".formatted(sum(shapes));
    }

    public String csv(List<Object> shapes) {
        return "sum, %s".formatted(sum(shapes));
    }
     */
}
