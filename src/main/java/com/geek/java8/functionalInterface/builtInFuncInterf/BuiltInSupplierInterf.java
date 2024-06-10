package com.geek.java8.functionalInterface.builtInFuncInterf;

import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
    //  It doesn't take any input or argument & yet returns a single o/p.
    //  Supplier variants - BooleanSupplier, DoubleSupplier, LongSupplier, IntSupplier
    //  These variants return type is their corresponding primitives only.
    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }
*/
public class BuiltInSupplierInterf {
    public static void main(String[] args){

        fibonacciNumbers();

        Supplier<Double> lazyValue = () -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 9D;
        };
        System.out.println(lazyValue);
    }

    private static void fibonacciNumbers() {
        int[] fibs = {0, 1};
        Stream<Integer> fibonacci = Stream.generate(() -> {
           int result = fibs[1];
           int fib3 = fibs[0] + fibs[1];
           fibs[0] = fibs[1];
           fibs[1] = fib3;
           return result;
        });
        //fibonacci.limit(10).peek(i -> System.out.print(i + ", ")).count();
        System.out.println();
        fibonacci.limit(15).forEach(i -> System.out.print(i + ", "));
    }
}
