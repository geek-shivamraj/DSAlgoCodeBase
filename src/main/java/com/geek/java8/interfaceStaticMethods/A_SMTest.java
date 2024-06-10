package com.geek.java8.interfaceStaticMethods;

interface Interf {
    public static void sum(int a, int b) {
        System.out.println("Interf Sum: " + (a + b));
    }
}

// Interface static methods by default not available to the implementation class,
// Overriding concept is not applicable. Based on our requirement, we can define exactly
// same method in the implementation class, it's valid but not overriding.

interface Interf1 extends Interf {
    public static void sum(int a, int b) {
        System.out.println("Interf1 Sum: " + (a + b));
    }
}

public class A_SMTest implements Interf{
    public static void main(String[] args) {
        A_SMTest test = new A_SMTest();
        // test.sum(10,20);     //CE
        // Test.sum(10, 20);    // CE

        Interf.sum(10, 20);
        Interf1.sum(20, 30);    // Not overriding
    }
}
