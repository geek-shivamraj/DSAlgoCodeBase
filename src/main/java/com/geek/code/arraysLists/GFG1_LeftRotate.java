package com.geek.code.arraysLists;

import java.util.*;

public class GFG1_LeftRotate {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5);
        int d = 2;
        //leftRotateBrute(input, d);
        leftRotateTempArray(input, d);
        System.out.println(input);
    }

    private static void leftRotateTempArray(List<Integer> input, int d) {
        int n = input.size();   // Complexity -- Time: O(n) Space : O(n)
        List<Integer> temp = new ArrayList<>();
        for(int i = d; i < n; i++)
            temp.add(input.get(i));
        for(int i = 0; i < d; i++)
            temp.add(input.get(i));
        Collections.copy(input, temp);
    }

    private static void leftRotateBrute(List<Integer> input, int d) {
        int n = input.size();       // Complexity -- Time: O(n*d) Space : O(1)
        for(int i = 0; i < d; i++) {
            int temp = input.get(0);
            for(int j = 1; j < n; j++)
                input.set(j - 1, input.get(j));
            input.set(n-1, temp);
        }
    }

    void leftRotate(int[] arr, int n, int d) {
        int[] temp = new int[n];
        int k = 0;
        for(int i = d; i < n; i++, k++)
            temp[k] = arr[i];

        for(int i = 0; i < d; i++, k++)
            temp[k] = arr[i];

        System.arraycopy(temp, 0, arr, 0, n);
    }
}
