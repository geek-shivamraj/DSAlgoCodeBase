package com.geek.dynamicProgramming.knapsack;

import java.util.Arrays;

public class DPMemorizedSol {
    private static int[][] t;
    public static void main(String[] args) {
        int n = 3, W = 4;
        int[] wt = {4, 5, 1};
        int[] val = {1, 2, 3};
        t = new int[n+1][W+1];
        for(int[] t1 : t)
            Arrays.fill(t1, -1);

        int maxVal = dpKnapSackMemorized(W, wt, val, n);
//        int maxVal = dpKnapSackMemorized(W, wt, val, n, t);
        print2DArray(t);
        System.out.println("Max Val: " + maxVal); // 3

    }

    private static int dpKnapSackMemorized(int W, int[] wt, int[] val, int n) {
        if(n == 0 || W == 0)
            return 0;
        if(t[n][W] != -1)
            return t[n][W];
        if(wt[n-1] > W)
            return t[n][W] = dpKnapSackMemorized(W, wt, val, n-1);
        else
            return t[n][W] = Math.max(
                    val[n-1] + dpKnapSackMemorized(W - wt[n-1], wt, val, n-1),
                    dpKnapSackMemorized(W, wt, val, n-1)
            );
    }

    private static int dpKnapSackMemorized(int W, int[] wt, int[] val, int n, int[][] t) {
        if (n == 0 || W == 0)
            return 0;
        if (t[n][W] != -1)
            return t[n][W];
        if (wt[n - 1] > W)
            return t[n][W] = dpKnapSackMemorized(W, wt, val, n - 1, t);
        else
            return t[n][W] = Math.max(
                    (val[n - 1] + dpKnapSackMemorized(W - wt[n - 1], wt, val, n - 1, t)),
                    dpKnapSackMemorized(W, wt, val, n - 1, t)
            );
    }

    private static void print2DArray(int[][] t) {
        for(int[] row: t)
            System.out.println(Arrays.toString(row));
    }

}
