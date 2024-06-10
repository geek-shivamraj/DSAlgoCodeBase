package com.geek.java8.doubleColonReferences;

interface Interf {
    public void m1(int i);
}

public class InstanceMethodReference {

    public void m2(int i) {
        System.out.println("From Method Reference: " + i);
    }
    public static void main(String[] args) {
        Interf interf = i -> System.out.println("From Lambda Expression: " + i);
        interf.m1(10);

        // Here functional interface method m1() referring to Test class instance method m2()
        InstanceMethodReference mrd = new InstanceMethodReference();
        Interf interf1 = mrd::m2;    // only m2 method argument must match with m1 method
        interf1.m1(20);
    }
}
