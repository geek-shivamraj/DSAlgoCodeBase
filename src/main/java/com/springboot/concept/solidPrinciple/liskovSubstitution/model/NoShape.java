package com.springboot.concept.solidPrinciple.liskovSubstitution.model;

import com.springboot.concept.solidPrinciple.openClosed.model.Shape;

/*
    Here NoShape class can't calculate area so here we broke the rule
 */
public class NoShape implements Shape {

    @Override
    public double area() {
        throw new IllegalStateException("Can't Calculate area");
    }
}
