package com.geek.coreConcept.singleton;

/*
    Static Block initialization implementation is similar to Eager initialization,
    except that instance of the class is created in the static block that provides
    the option for exception handling.
 */

public class EagerStaticBlockSingleton {
    private static final EagerStaticBlockSingleton instance;
    public String str;
    private EagerStaticBlockSingleton() {
        str = "Hello I am a string part of Singleton class";
    }

    static {
        try {
            instance = new EagerStaticBlockSingleton();
        } catch (Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }
}
