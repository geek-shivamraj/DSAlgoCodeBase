package com.springboot.concept.solidPrinciple.liskovSubstitution;

import com.springboot.concept.solidPrinciple.liskovSubstitution.model.*;

import java.util.List;

/*
    Every subclass or derived class should be substitutable
    for their base or parent class.

    Here NoShape class is implementing Shape but it can't calculate area
    i.e., it's violating the Shape i/f rule.
    That's why NoShape is never going to be substitutable by base or parent class/interface.
 */

public class LSMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Shape rectangle = new Rectangle();
        // NoShape class can't calculate area
        // i.e., NoShape can't be substituted as Shape
       // Shape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        int sum = new AreaCalculator().sum(shapes);
        ShapesPrinter sp = new ShapesPrinter();
        System.out.println(sp.json(sum));
        System.out.println(sp.csv(sum));
    }
}
