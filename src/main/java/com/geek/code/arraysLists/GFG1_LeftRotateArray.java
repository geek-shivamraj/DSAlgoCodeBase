package com.geek.code.arraysLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GFG1_LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int d = 2;
        //leftRotateBrute(arr, d);
        //leftRotateTempArray(arr, d);
        leftRotateJugglingAlgo(arr, d);
        for(int i : arr) System.out.print(i + ", ");
    }

    private static void leftRotateJugglingAlgo(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcdEuclidAlgorithm(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    private static int gcdEuclidAlgorithm(int a, int b) {
        return b == 0 ? a : gcdEuclidAlgorithm(b, a%b);
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    private static void leftRotateTempArray(int[] arr, int d) {
        int n = arr.length;     // Complexity -- Time: O(n) Space : O(n)
        int[] temp = new int[n];
        int k = 0;
        for(int i = d; i < n; i++, k++)
            temp[k] = arr[i];

        for(int i = 0; i < d; i++, k++)
            temp[k] = arr[i];

        System.arraycopy(temp, 0, arr, 0, n);
    }
    private static void leftRotateBrute(int[] arr, int d) {
        int n = arr.length;       // Complexity -- Time: O(n*d) Space : O(1)
        for(int i = 0; i < d; i++) {
            int temp = arr[0];
            for(int j = 0; j < n - 1; j++)
                arr[j] = arr[j + 1];
            arr[n-1] = temp;
        }
    }

}
