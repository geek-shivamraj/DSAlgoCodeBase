package com.geek.coreConcept.singleton;

/*
    To create a Singleton class, we must follow the steps:
    1. Ensure that only one instance of the class exists (static variable)
    2. Provide global access to that instance by
        - Declaring all constructors of the class to be private.
        - Providing a static method that returns a reference to the instance.
            The lazy initialization concept is used to write the static methods.
        - The instance is stored as a private static variable.
    For e.g., Runtime, etc.
    - Private constructors & factory methods are also an example of the Singleton class.

    2 Forms of Singleton design patterns
        1. Early instantiation: The object creation takes place at the load time.
        2. Lazy instantiation: The object creation is done acc to the requirement.
 */

public class LazyThreadSafeSingleton {
    private static LazyThreadSafeSingleton instance;
    public String str;
    private LazyThreadSafeSingleton() {
        str = "Hello I am a string part of Singleton class";
    }

    public static synchronized LazyThreadSafeSingleton getInstance() {
        if(instance == null)
            instance = new LazyThreadSafeSingleton();
        return instance;
    }
}
