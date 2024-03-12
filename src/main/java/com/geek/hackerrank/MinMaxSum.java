package com.geek.hackerrank;

import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = List.of(256741038, 623958417, 467905213, 714532089, 938071625);

        // long sum = arr.stream().mapToLong(Integer::longValue).sum();
        // long min = arr.stream().mapToLong(Integer::longValue).min().getAsLong();
        // long max = arr.stream().mapToLong(Integer::longValue).max().getAsLong();

         long sum = arr.stream().mapToLong(Long::valueOf).sum();
         long min = arr.stream().mapToLong(Long::valueOf).min().getAsLong();
         long max = arr.stream().mapToLong(Long::valueOf).max().getAsLong();

//        long sum = arr.stream().mapToLong(i -> i).sum();
//        long min = arr.stream().mapToLong(i -> i).min().getAsLong();
//        long max = arr.stream().mapToLong(i -> i).max().getAsLong();

        System.out.println((sum-max) + " " + (sum-min));
    }
}
