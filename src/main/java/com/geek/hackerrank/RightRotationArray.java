package com.geek.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RightRotationArray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        reverseList(2, list);
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();
    }

    private static void reverseList(int rotationCount, List<Integer> list) {

        List<Integer> left = list.subList(0, rotationCount);
        List<Integer> right = list.subList(rotationCount, list.size());
        Collections.reverse(left);
        Collections.reverse(right);
        list = Stream.concat(left.stream(), right.stream()).collect(Collectors.toList());
        Collections.reverse(list);

    }
}
