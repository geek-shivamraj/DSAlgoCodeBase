package com.geek.java8.streamAPI.processing;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        // With Specified values
        IntStream intStream = IntStream.of(10);     // 10
        intStream = IntStream.of(1, 2, 3);      // 1, 2, 3

        // Generating ints in Range
        intStream = IntStream.range(1, 5);          // 1, 2, 3, 4
        intStream = IntStream.rangeClosed(1, 5);    // 1, 2, 3, 4, 5

        // Infinite streams with Iteration
        intStream = IntStream.iterate(0, i -> i + 2).limit(10); // 0,2,4,6..18

        intStream = IntStream.generate(() -> { return (int)(Math.random() * 10000); });
        intStream.limit(10).forEach(i -> System.out.print(i + ", "));
        System.out.println();

        intStream = IntStream.concat(IntStream.of(1,2), IntStream.of(3,4));
        intStream.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        IntStream stream = IntStream.range(1, 100);
        List<Integer> primes = stream.filter(IntStreamDemo::isPrime).boxed().collect(Collectors.toList());
        System.out.println(primes);
    }

    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}
