package com.springboot.concept.solidPrinciple.singleResponsibility.model;

public class Square {
    private final int length;

    public Square(int lenght) {
        this.length = lenght;
    }

    public int getLength() {
        return length;
    }
}
