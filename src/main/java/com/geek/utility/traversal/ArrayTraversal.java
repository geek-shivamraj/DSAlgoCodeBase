package com.geek.utility.traversal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayTraversal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        scan.close();

        System.out.print("Using Arrays.stream: ");
        Arrays.stream(arr).forEach(i -> {
            System.out.print(i + ", ");
        });
        System.out.println();

        System.out.print("Using Arrays.stream: ");
        IntStream.range(0, arr.length).forEach(i -> {
            System.out.print(i + ", ");
        });
        System.out.println();

        System.out.print("Using enhanced for loop: ");
        for(int i : arr)
            System.out.print(i + ", ");
        System.out.println();

        System.out.print("Using basic for loop: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }
}
