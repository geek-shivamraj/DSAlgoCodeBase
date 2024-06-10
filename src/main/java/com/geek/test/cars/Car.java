package com.geek.test.cars;

public interface Car {
    default void start() {
        System.out.println("Car started!!");
    }
    default void drive(String carType) {
        start();
        stop();
    }
    default void stop() {
        System.out.println("Car stopped!!");
    }
}
