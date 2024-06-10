package com.geek.java8.interfaceDefaultMethods;

interface Left {
    default void m1() {
        System.out.println("Left: Default Method");
    }
}
interface Right {
    default void m1() {
        System.out.println("Right: Default Method");
    }
}
public class B_DMTest implements Left, Right {
    @Override
    public void m1() {
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args) {
        B_DMTest test = new B_DMTest();
        test.m1();
    }
}
