package com.geek.java8.functions;

import java.util.concurrent.atomic.AtomicInteger;

interface Interf1 {
    public void m1();
}
public class LambdaTest {
    private int x = 777;
    public void m2() {
        AtomicInteger x = new AtomicInteger(666);
        Interf1 interf1 = () -> {
            System.out.println("x : " + x);
            x.set(888);
            System.out.println("x : " + x);
            System.out.println("this.x : " + this.x);
            this.x = 555;
            System.out.println("this.x : " + this.x);
        };
        interf1.m1();
        System.out.println("x : " + x);
    }
    public static void main(String[] args) {
        LambdaTest t1 = new LambdaTest();
        t1.m2();
        System.out.println("t1.x : " + t1.x);
    }
}
