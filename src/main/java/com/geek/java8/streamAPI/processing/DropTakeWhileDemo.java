package com.geek.java8.streamAPI.processing;

import java.util.stream.IntStream;

public class DropTakeWhileDemo {
    public static void main(String[] args) {
        int[] arr1 = {4,4,4,12,16,24,40,5,44,6,7,8,9,10};

        IntStream.of(arr1).dropWhile(i -> i%4 == 0)
                .forEach(i -> System.out.print(i + ", ")); // 5, 44, 6, 7, 8, 9, 10,
        System.out.println();
        // If the stream is ordered, it returns a stream consisting of the longest prefix taken
        // from this stream that match the given predicate.
        IntStream.of(arr1).takeWhile(i -> i%4 == 0)
                .forEach(i -> System.out.print(i + ", ")); // 4, 4, 4, 12, 16, 24, 40,
    }
}
