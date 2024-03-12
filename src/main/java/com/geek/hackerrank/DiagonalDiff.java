package com.geek.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiagonalDiff {

    private static int diagonalDifference(List<List<Integer>> arr) {
        int diagonal1 = 0, diagonal2 = 0;
        for(int i = 0; i < arr.size(); i++)
            diagonal1 += arr.get(i).get(i);

        int j = arr.size() - 1;
        for(int i = 0; i < arr.size() && j >= 0; i++, j--)
            diagonal2 += arr.get(i).get(j);

        int sum = Math.abs(diagonal1 - diagonal2);

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);
        System.out.println("Result: " + result);
        bufferedReader.close();
    }

}
