package com.springboot.concept.solidPrinciple.openClosed;

import com.springboot.concept.solidPrinciple.openClosed.model.*;

import java.util.List;

/*
    Classes should be open for extension,
    but closed for modification.
    Let's add new shape: Cube
 */

public class OCMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10);
        //List<Shape> shapes = List.of(circle, square);
        // Here we're extending the area by adding new shapes
        // but not modifying it.
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        int sum = new AreaCalculator().sum(shapes);
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
