package com.geek.java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListCompare {
    public static void main(String[] args) {
        List<String> lit = List.of("1", "2", "1", "2", "3");

        lit.stream().filter(l -> Collections.frequency(lit, l) > 1).distinct().collect(Collectors.toList()).stream().forEach(System.out::println);
    }
}
