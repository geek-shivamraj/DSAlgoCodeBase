package com.springboot.concept.solidPrinciple.liskovSubstitution.model;

public class Cube implements Shape {
    @Override
    public double area() {
        return 100;
    }
}
