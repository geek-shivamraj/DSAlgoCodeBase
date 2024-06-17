package com.springboot.concept.solidPrinciple.singleResponsibility;

import com.springboot.concept.solidPrinciple.singleResponsibility.model.Circle;
import com.springboot.concept.solidPrinciple.singleResponsibility.model.Square;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes) {
        int sum = 0;
        for(int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if(shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }

            if(shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
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
