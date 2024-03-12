package com.geek.java8;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListElementsSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        simpleArraySum(ar);

        bufferedReader.close();
    }

    private static void simpleArraySum(List<Integer> input) {
        int result1 = input.stream().mapToInt(Integer::valueOf).sum();
        System.out.println("Sum using mapToInt: " + result1);

        int result2 = input.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum using :: intValue: " + result2);

        int result3 = input.stream().mapToInt(i -> i).sum();
        System.out.println("Sum using Lambda: " + result3);

        int result4 = input.stream().reduce((x, y) -> x + y).get();
        System.out.println("Sum using reduce lambda: " + result4);

        int result5 = input.stream().reduce(Integer::sum).get();
        System.out.println("Sum using reduce double colon: " + result5);
    }
}
