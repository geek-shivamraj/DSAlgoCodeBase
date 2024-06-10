package com.geek.java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Stream s = collection.stream();
        System.out.println(s);

        // Filtering
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        Stream s1 = input.stream().filter(i -> i%2 == 0);

        // Mapping
        Stream s2 = input.stream().map(i -> i + 10);

        List<Integer> list = List.of(1,2,3);
//        list.
        Map<Integer, String> map = Map.of(1, "shiv", 2, "moon");
//        map.

    }
}
