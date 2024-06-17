package com.springboot.concept.solidPrinciple.dependencyInversion;

import com.springboot.concept.solidPrinciple.dependencyInversion.model.Shape;

import java.util.List;

public interface IAreaCalculator {
    int sum(List<Shape> shapes);
}
