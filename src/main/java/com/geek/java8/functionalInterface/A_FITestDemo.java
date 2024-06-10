package com.geek.java8.functionalInterface;

@FunctionalInterface
interface Interf {
    public void sum(int a, int b);
//    public void sum1(int x);
}

class MyInterf implements Interf {
    @Override
    public void sum(int a, int b) {
        System.out.println("MyInterf Sum: " + (a + b));
    }
}

public class A_FITestDemo {
    public static void main(String[] args) {
        Interf i1 = new MyInterf();
        i1.sum(5, 6);

        Interf i2 = (a, b) -> System.out.println("Lambda sum: " + (a + b));
        i2.sum(3, 7);
    }
}


