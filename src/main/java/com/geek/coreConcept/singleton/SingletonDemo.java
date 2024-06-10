package com.geek.coreConcept.singleton;

/*
    To create a Singleton class, we must follow the steps:
    1. Ensure that only one instance of the class exists (static variable)
    2. Provide global access to that instance by
        - Declaring all constructors of the class to be private.
        - Providing a static method that returns a reference to the instance.
            The lazy initialization concept is used to write the static methods.
        - The instance is stored as a private static variable.
 */

public class SingletonDemo {
    public static void main(String[] args) {
        LazyThreadSafeSingleton x = LazyThreadSafeSingleton.getInstance();
        LazyThreadSafeSingleton y = LazyThreadSafeSingleton.getInstance();
        EagerSingleton x1 = EagerSingleton.getInstance();
        EagerSingleton y1 = EagerSingleton.getInstance();

        System.out.println("Hashcode of x: " + x.hashCode());
        System.out.println("Hashcode of y: " + y.hashCode());
        System.out.println("Hashcode of x1: " + x1.hashCode());
        System.out.println("Hashcode of y1: " + y1.hashCode());

        System.out.println("X str: " + x.str);
        System.out.println("Y str: " + y.str);
        x.str = "Newly created";
        System.out.println("X str: " + x.str);
        System.out.println("Y str: " + y.str);
    }
}
