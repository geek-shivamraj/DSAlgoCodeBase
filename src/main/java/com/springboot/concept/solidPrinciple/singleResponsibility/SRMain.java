package com.springboot.concept.solidPrinciple.singleResponsibility;

import com.springboot.concept.solidPrinciple.singleResponsibility.model.Circle;
import com.springboot.concept.solidPrinciple.singleResponsibility.model.Square;

import java.util.List;

/*
    Each class should have only one sole purpose,
    and not be filled with excessive functionality
 */

public class SRMain {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + sum);

        // json(), csv() method in AreaCalculator class are added functionality
        // & voilating single responsibility principle
//        System.out.println(areaCalculator.json(shapes));
//        System.out.println(areaCalculator.csv(shapes));

        // ShapesPrinter class now has single resposibility of printing sum
        // in different formats
        ShapesPrinter sp = new ShapesPrinter();
        System.out.println(sp.json(sum));
        System.out.println(sp.csv(sum));
    }
}
