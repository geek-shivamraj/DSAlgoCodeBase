package com.geek.java8.interfaceDefaultMethods;

interface A_Interf {
    default void m1() {
        System.out.println("A_Interf: Default Method");
    }
}
// we can override Parent class Default methods
interface A1_Interf extends A_Interf {
    @Override
    default void m1() {
        System.out.println("A1_Interf: Default Method");
    }
}
public class A_DMTest implements A1_Interf{
    public static void main(String[] args) {
        A_DMTest test = new A_DMTest();
        test.m1();
    }
}
