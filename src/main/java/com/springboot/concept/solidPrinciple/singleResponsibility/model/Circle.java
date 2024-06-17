package com.springboot.concept.solidPrinciple.singleResponsibility.model;

public class Circle {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
}
