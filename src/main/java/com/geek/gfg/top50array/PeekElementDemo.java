package com.geek.gfg.top50array;

public class PeekElementDemo {
    public static void PeekElementMain() {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        System.out.println(peekElement(arr, n));
        System.out.println("********************");
        System.out.println(peekElementOp(arr, 0, n-1, n));
    }

    private static int peekElementOp(int[] arr, int low, int high, int n) {
        int mid = (low + high)/2;

//        if(mid == 0 || arr[mid-1] <= arr[mid] &&
        return 0;
    }

    // Time Complexity: O(n)
    private static int peekElement(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            if(i == 0 && arr[i] >= arr[i+1])
                return 0;
            else if(i == n-1 && arr[i] >= arr[i-1])
                return  n-1;
            else if(i != 0 && arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                return i;
        }
        return -1;
    }
}
