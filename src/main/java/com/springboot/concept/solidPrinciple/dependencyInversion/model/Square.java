package com.springboot.concept.solidPrinciple.dependencyInversion.model;

public class Square implements Shape {
    private final int length;

    public Square(int lenght) {
        this.length = lenght;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }
}
