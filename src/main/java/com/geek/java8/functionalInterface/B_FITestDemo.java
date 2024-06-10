package com.geek.java8.functionalInterface;

@FunctionalInterface
interface FI_Square {
    public int square(int x);
}

public class B_FITestDemo {
    public static void main(String[] args) {
        FI_Square fi = x -> x*x;
        System.out.println("FI Square: " + fi.square(5));
    }
}


