package com.geek.java8.streamAPI.processing;

import java.util.List;

public class CountingDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5, 6, 7, 8, 8, 9, 10, 10, 11, 12);
        long count1 = list.stream().count();
        System.out.println(count1);

        count1 = list.stream().filter(i -> i%2 == 0).count();
        System.out.println(count1);

        count1 = list.stream().filter(i -> i%2 == 0).distinct().count();
        System.out.println(count1);
    }
}
