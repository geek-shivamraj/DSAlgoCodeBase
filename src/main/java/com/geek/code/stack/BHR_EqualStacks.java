package com.geek.code.stack;

import java.util.*;
import java.util.stream.Collectors;

// Output: 26, 91

public class BHR_EqualStacks {
    public static void main(String[] args) {
        List<Integer> h1 = new ArrayList<>(List.of(3, 2, 1, 1, 1));
        List<Integer> h2 = new ArrayList<>(List.of(4,3,2));
        List<Integer> h3 = new ArrayList<>(List.of(1,1,4,1));
        int height = equalStacks(h1, h2, h3);
        System.out.println(height);
    }

    private static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = h1.stream().reduce(0, (a,b) -> a + b);
        int sum2 = h2.stream().reduce(0, Integer::sum);
        //int sum3 = h3.stream().collect(Collectors.summingInt(Integer::intValue));
        int sum3 = h3.stream().mapToInt(Integer::intValue).sum();

        while(true) {
            if(sum1 == sum2 && sum1 == sum3)
                return sum1;
            if(sum1 >= sum2 && sum1 >= sum3)
                sum1 -= h1.remove(0);
            else if(sum2 >= sum1 && sum2 >= sum3)
                sum2 -= h2.remove(0);
            else if(sum3 >= sum1 && sum3 >= sum2)
                sum3 -= h3.remove(0);
        }

    }
}
