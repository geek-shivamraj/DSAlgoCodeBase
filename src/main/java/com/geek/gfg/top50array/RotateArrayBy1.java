package com.geek.gfg.top50array;

import java.util.stream.IntStream;

public class RotateArrayBy1 {
    public static void RotateArrayBy1Main() {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArrayByOne(arr);
        IntStream.range(0, arr.length).forEach(i -> System.out.print(arr[i] + ", "));
    }

    private static void rotateArrayByOne(int[] arr) {
        int last = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--)
            arr[i + 1] = arr[i];
        arr[0] = last;
    }
}
