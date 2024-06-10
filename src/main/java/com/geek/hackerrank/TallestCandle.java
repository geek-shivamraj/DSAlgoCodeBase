package com.geek.hackerrank;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TallestCandle {
    public static void main(String[] args) {
        List<Integer> candles = List.of(3, 2, 1, 3);

        int max = candles.stream().mapToInt(v -> v).max().orElse(0);
        System.out.println(max);
        int count = (int) candles.stream().filter(c -> c == max).count();
        System.out.println("Count: " + count);

        Map<Integer, Long> counts = candles.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);

    }
}
