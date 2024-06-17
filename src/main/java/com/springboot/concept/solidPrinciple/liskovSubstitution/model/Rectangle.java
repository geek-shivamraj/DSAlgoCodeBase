package com.springboot.concept.solidPrinciple.liskovSubstitution.model;

public class Rectangle implements Shape {
    @Override
    public double area() {
        return 20;
    }
}
