package com.geek.java8.functionalInterface.builtInFuncInterf;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
    //  Predicate variants - BiPredicate, IntPredicate, DoublePredicate, LongPredicate
    //  These variants accept primitive values as arguments.
    //  Predicate i/f takes only 1 argument but BiPredicate i/f takes 2 arguments.
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);          // return boolean
    }
    @FunctionalInterface
    public interface BiPredicate<T, U> {
        boolean test(T t, U u);     // return boolean
    }
*/
public class BuiltInPredicateInterf {
    public static void main(String[] args){
        Predicate<Integer> predicate = i -> i % 2 == 0;
        predicate.test(10);

        BiPredicate<Integer, Integer> biPredicate = (i, j) -> i%2 == 0 && i%3 == 0;
        biPredicate.test(4, 9);
    }
}
