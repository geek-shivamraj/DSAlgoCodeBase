package com.springboot.concept.solidPrinciple.interfaceSegregation.model;

public class Cube implements Shape, ThreeDimensionalShape {
    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 0;
    }
}
