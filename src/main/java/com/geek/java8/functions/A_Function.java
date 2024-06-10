package com.geek.java8.functions;

import java.util.function.Function;

public class A_Function {
    public static void main(String[] args) {
        Function<String, Integer> function1 = s -> s.length();
        System.out.println(function1.apply("abc"));
        System.out.println(function1.apply("abdfafdac"));
    }
}
