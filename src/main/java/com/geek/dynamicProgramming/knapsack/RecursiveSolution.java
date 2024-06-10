package com.geek.dynamicProgramming.knapsack;

public class RecursiveSolution {
    public static void main(String[] args) {
        int n = 3, W = 4;
        int[] wt = {4, 5, 1};
        int[] val = {1, 2, 3};
        int maxVal = knapSack_01_Recursive(W, wt, val, n);
        System.out.println("Max Val: " + maxVal); // 3
    }

    // Time Complexity: O(2^n) becoz In every recursive call "knapSack_01_Recursive",
    // we're making 2 more calls to the same function so calls are increasing
    // at a rate of 2 until 'N' or 'W' reaches 0. There will be atmost '2^n' calls in the code.
    // Space Complexity: O(N), Stack space required for Recursion.
    private static int knapSack_01_Recursive(int W, int[] wt, int[] val, int n) {
        if(n == 0 || W == 0)        // Base Condition
            return 0;

        if(W > wt[n - 1])
            return knapSack_01_Recursive(W, wt, val, n - 1);
        else
            return Math.max(
                    val[n - 1] + knapSack_01_Recursive(W - wt[n - 1], wt, val, n - 1),
                    knapSack_01_Recursive(W, wt, val, n - 1)
            );
    }
}
