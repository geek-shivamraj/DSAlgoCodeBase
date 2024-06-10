package com.geek.java8.predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class A_Predicates {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = i -> i > 20;
        System.out.println(predicate1.test(10));
        System.out.println(predicate1.test(30));

        Predicate<String> predicate2 = s -> s.length() > 3;
        System.out.println(predicate2.test("abc"));
        System.out.println(predicate2.test("abcd"));

        Predicate<Collection> predicate3 = c -> c.isEmpty();
        System.out.println(predicate3.test(new ArrayList<>()));
    }
}
