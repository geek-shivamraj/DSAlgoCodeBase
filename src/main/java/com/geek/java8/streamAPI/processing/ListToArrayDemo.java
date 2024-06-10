package com.geek.java8.streamAPI.processing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListToArrayDemo {
    public static void main(String[] args){

        // List<Integer> to Object[]
        List<Integer> list1 = Arrays.asList(3, 5, 9, 3, 5, 6);
        Object[] arr1 = list1.stream().toArray();
        // IntStream.of(arr1).forEach(i -> System.out.print(i + ", ")); // Only int[] supported
        System.out.print("IntStream Object[] : ");
        IntStream.range(0, arr1.length).forEach(i -> System.out.print(arr1[i] + ", "));
        System.out.println();
        System.out.print("Stream Object[] : ");
        System.out.println(Stream.of(arr1).collect(Collectors.toList()));
        System.out.print("Stream Peek: ");
        Stream.of(arr1).peek(i -> System.out.print(i + ", ")).collect(Collectors.toList());
        System.out.println();

        // List<Integer> to int[]
        List<Integer> list2 = Arrays.asList(2,6,3,8,7);
        int[] arr2 = list2.stream().mapToInt(i -> i).toArray();
        IntStream.of(arr2).forEach(i -> System.out.print(i + ", "));
        System.out.println();
        IntStream.range(0, arr2.length).forEach(i -> System.out.print(arr2[i] + ", "));
        System.out.println();
        System.out.println(Stream.of(arr1).collect(Collectors.toList())); // Won't work as int[]

        // int[] to Integer[]
        Integer[] boxedArr = IntStream.of(arr2).boxed().toArray(Integer[]::new);

        // List<Integer> to Integer[]
        List<Integer> list3 = Arrays.asList(12, 15, 18, 13, 19);
        Integer[] arr3 = list3.toArray(Integer[]::new);
        // IntStream.of(arr3).forEach(i -> System.out.print(i + ", ")); // Only Integer[] supported
        System.out.print("IntStream Integer[] : ");
        IntStream.range(0, arr3.length).forEach(i -> System.out.print(arr3[i] + ", "));
        System.out.println();
        System.out.print("Stream Integer[] : ");
        System.out.println(Stream.of(arr3).collect(Collectors.toList()));
        System.out.print("Stream Peek: ");
        Stream.of(arr3).peek(i -> System.out.print(i + ", ")).collect(Collectors.toList());
        System.out.println();

    }
}
