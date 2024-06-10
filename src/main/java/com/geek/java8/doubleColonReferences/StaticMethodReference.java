package com.geek.java8.doubleColonReferences;

public class StaticMethodReference {

    public static void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i + ": " + "Static: " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {

        // Using static method references
        Runnable runnable1 = StaticMethodReference::run;
        Thread t1 = new Thread(runnable1);
        t1.start();
        for(int i = 0; i < 5; i++)
            System.out.println(i + ": " + Thread.currentThread().getName());

        // Using Lambda Expression
        Runnable runnable2 = () -> {
            for(int i = 0; i < 5; i++)
                System.out.println(i + ": " + Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable2);
        t.start();
        for(int i = 0; i < 5; i++)
            System.out.println(i + ": " + Thread.currentThread().getName());
    }
}
