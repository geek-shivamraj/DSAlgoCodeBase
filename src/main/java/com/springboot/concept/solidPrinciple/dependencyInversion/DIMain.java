package com.springboot.concept.solidPrinciple.dependencyInversion;


import com.springboot.concept.solidPrinciple.dependencyInversion.model.*;

import java.util.List;

/*
    Components should depend on abstractions, not on concretion.
*/

public class DIMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Shape rectangle = new Rectangle();
        // NoShape class can't calculate area
        // i.e., NoShape can't be substituted as Shape
       // Shape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube, rectangle);

        //int sum = new AreaCalculator().sum(shapes);
        IAreaCalculator areaCalculator = new AreaCalculator();
        int sum = areaCalculator.sum(shapes);

        ShapesPrinter sp = new ShapesPrinter(areaCalculator);
        System.out.println(sp.json(shapes));
        System.out.println(sp.csv(shapes));
    }
}
