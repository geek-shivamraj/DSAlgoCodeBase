package com.geek.java8.functionalInterface.builtInFuncInterf;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
/*
    //  Consumer variants - BiConsumer, DoubleConsumer, IntConsumer, LongConsumer
    //  These variants accept primitive values as arguments.
    //  Consumer i/f takes only 1 argument but BiConsumer i/f takes 2 arguments.
    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);   // no return type
    }

    @FunctionalInterface
    public interface BiConsumer<T, U> {
        void accept(T t, U u);
    }
*/
public class BuiltInConsumerInterf {
    public static void main(String[] args){
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        consumer.accept(11);

        BiConsumer<Integer, Integer> biConsumer = (v1, v2) -> System.out.println(v1 + ", " + v2);
        biConsumer.accept(7, 13);
    }
}
