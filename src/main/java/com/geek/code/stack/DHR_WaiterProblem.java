package com.geek.code.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DHR_WaiterProblem {
    public static void main(String[] args) {
        List<Integer> number = List.of(2,3,4,5,6,7);
        int q = 3;
        List<Integer> newArray = waiter(number, q);
        System.out.println(newArray);
    }

    private static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> stackA = new ArrayDeque<>();
        Deque<Integer> stackB = new ArrayDeque<>();
        number.stream().forEach(i -> {
            //if()
        });

        return result;
    }

    private int getPrimeNumberByIndex(int index) {
        int num = 2;
        for(int i = 1; i <= index; i++) {
            //if((num + 1)%
        }
        return num;
    }
}
