package com.geek.ibm;

import java.util.*;
import java.util.stream.Stream;

public class UnSortedArrayMissingElement {

    public static void main(String[] main) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while(!line.isEmpty()) {
            int[] unsorted1 = Stream.of(line.split(",")).map(i -> i.trim()).mapToInt(Integer::parseInt).toArray();
            //int[] unsorted2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
            //Arrays.stream(unsorted2).forEach(System.out::print);
            System.out.print("Input Array: ");
            Arrays.stream(unsorted1).forEach(i -> System.out.print(i + ", "));
            System.out.println();
            //Unsorted array missing element
            findMissingElement1(unsorted1);
            findMissingElement2(unsorted1);
            findMissingElement3(unsorted1);
            line = in.nextLine();
        }
    }

    private static void findMissingElement1(int[] unsorted1) {
        System.out.println("Brute Force Approach");
        int missingElement = 0;
        int n = unsorted1.length;
        for(int i = 1; i <= n; i++) {
            boolean foundFlag = false;
            for(int j = 0; j < n; j++) {
                if(unsorted1[j] == i) {
                    foundFlag = true;
                    break;
                }
            }
            if(!foundFlag) {
                missingElement = i;
            }
        }
        System.out.println("Missing no. : " + missingElement);
    }

    private static void findMissingElement2(int[] inputArray) {
        System.out.println("Sorting & Iterating Approach");
        int missingElement = 0;
        Arrays.sort(inputArray);
        int n = inputArray.length;
        for(int i = 0; i < n; i++) {
            if(inputArray[i] != i+1) {
                missingElement = i + 1;
                break;
            }
        }
        System.out.println("Missing no. : " + missingElement);
    }

    private static void findMissingElement3(int[] inputArray) {
        System.out.println("Using Array Approach");
        int n = inputArray.length;
        int[] indexArray = new int[n+1]; // Ignoring zero index
        for(int i = 0; i < n; i++) {
            int element = inputArray[i];
            indexArray[element-1] = element;
        }
        for(int i = 0; i < indexArray.length; i++) {
            if(indexArray[i] == 0) {
                System.out.println("Missing no. : " + (i + 1));
                break;
            }
        }
    }

}
