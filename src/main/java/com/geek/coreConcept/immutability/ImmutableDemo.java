package com.geek.coreConcept.immutability;

import java.util.HashMap;
import java.util.Map;

/*
    1. The class must be declared as final so that child classes can't be created.
    2. Data members in the class must be declared private so that direct access is not allowed.
    3. Data members in the class must be declared as final so that we can't change the value
        of it after object creation.
    4. A parameterized constructor should initialize all the fields performing a deep copy so
        that data members can't be modified with an object reference.
    5. Deep copy of objects should be performed in the getter methods to return a copy rather
        than returning the actual object reference.

    Note: We don't need to perform deep copy or cloning of data members of wrapper types as
        they are already immutable.
 */


public class ImmutableDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");

        ImmutableStudent s = new ImmutableStudent("ABC", 101, map);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        map.put("3", "third");
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
        System.out.println(s.getMetadata());

    }
}
