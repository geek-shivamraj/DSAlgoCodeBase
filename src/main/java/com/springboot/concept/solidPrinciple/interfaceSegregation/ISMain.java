package com.springboot.concept.solidPrinciple.interfaceSegregation;

import com.springboot.concept.solidPrinciple.interfaceSegregation.model.*;
import com.springboot.concept.solidPrinciple.liskovSubstitution.ShapesPrinter;

import java.util.List;

/*
    Interfaces should not force classes to implement
    what they can't do.
    Large interfaces should be divided into small ones.

    E.g., Here Cube has Volume as it's 3D shaped but this will
    break Circle as it's not a 3D shaped or volume.

    Solution: Create a new interface ThreeDimensionalShape and
    Cube will implement it for volume definition without affecting others.
 */

public class ISMain {
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
