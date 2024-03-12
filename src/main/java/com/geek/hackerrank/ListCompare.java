package com.geek.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ListCompare {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3);
        List<Integer> b = List.of(3, 2, 1);
        List<Integer> result1 = compareTriplets(a, b);
        List<Integer> result2 = compareTriplets(a, b);
        result1.stream().forEach(i -> System.out.print(i + ", "));
        System.out.println();
        result2.stream().forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }

    private static List<Integer> compareTripletsStream(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        AtomicInteger aCount = new AtomicInteger(0);
        AtomicInteger bCount = new AtomicInteger(0);
        IntStream.range(0, a.size()).forEach(i -> {
            if(a.get(i) > b.get(i))
                aCount.getAndIncrement();
            else if (a.get(i) < b.get(i))
                bCount.getAndIncrement();
        });
        result.add(aCount.get()); result.add(bCount.get());
        return result;
    }
    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        int aCount = 0, bCount = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i))
                aCount++;
            else if (a.get(i) < b.get(i))
                bCount++;
        }
        result.add(aCount); result.add(bCount);
        return result;
    }
}
