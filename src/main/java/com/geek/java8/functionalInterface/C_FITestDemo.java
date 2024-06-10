package com.geek.java8.functionalInterface;

//@FunctionalInterface
//interface Runnable {
//    public abstract void run();
//}

public class C_FITestDemo {
    public static void main(String[] args) {

        // Anonymous Inner class
        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Anonymous Inner Class: " + Thread.currentThread().getName());
                }
            }
        });
        myThread1.start();

        // Lambda instead of Anonymous class
        Thread myThread2 = new Thread(() -> {
                for(int i = 0; i < 5; i++) {
                    System.out.println(i + ": Inner Child class: " + Thread.currentThread().getName());
                }
        });
        myThread2.start();

        Runnable runnable = () -> {     // Functional Interface
            for(int i = 0; i < 5; i++)
                System.out.println(i + ": " + Thread.currentThread().getName());
        };
        Thread myThread3 = new Thread(runnable);
        myThread3.start();
        for(int i = 0; i < 5; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
    }
}


