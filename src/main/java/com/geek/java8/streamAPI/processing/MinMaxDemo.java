package com.geek.java8.streamAPI.processing;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(33, 88, 44, 22, 11, 99, 77);
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        min = list.stream().min((s1, s2) -> s1.compareTo(s2));
        min = list.stream().min(Integer::compareTo);
        min = list.stream().min(Integer::compare);

        Integer minOut = min.isPresent() ? min.get() : Integer.MIN_VALUE;
        minOut = min.orElse(Integer.MIN_VALUE);
        System.out.println(minOut);

        Optional<Integer> max = list.stream().min(Comparator.naturalOrder());
        max = list.stream().max((s1, s2) -> s1.compareTo(s2));
        max = list.stream().max(Integer::compareTo);
        max = list.stream().max(Integer::compare);

        Integer maxOut = max.isPresent() ? max.get() : Integer.MAX_VALUE;
        maxOut = max.orElse(Integer.MAX_VALUE);
        System.out.println(maxOut);
    }
}
