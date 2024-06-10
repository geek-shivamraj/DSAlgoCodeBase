package com.geek.java8.functionalInterface.builtInFuncInterf;

import java.util.function.*;

/*
    //  Function variants - BiFunction
    //  Function - UnaryOperator
    //  BiFunction - BinaryOperator
    //  These variants accept primitive values as arguments.
    //  Function i/f takes only 2 argument but BiFunction i/f takes 3 arguments.
    @FunctionalInterface
    public interface Function<T, R> {   T- ArgumentType, R -> ReturnType
        R apply(T t);
    }
    @FunctionalInterface
    public interface BiFunction<T, U, R> {
        R apply(T t, U u);
    }
*/
public class BuiltInFunctionInterf {
    public static void main(String[] args){
        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("Shivam"));

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("abc", "deff"));

    }
}
