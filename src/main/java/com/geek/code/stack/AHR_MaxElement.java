package com.geek.code.stack;

import java.util.*;

// Output: 26, 91

public class AHR_MaxElement {
    public static void main(String[] args) {
        List<String> operations = List.of("1 97", "2", "1 20", "2", "1 26",
                "1 20", "2", "3", "1 91", "3");
        List<Integer> max = getMax(operations);
        System.out.println(max);
    }

    private static List<Integer> getMax(List<String> operations) {
        List<Integer> max = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        operations.stream().forEach(op -> {
            if(op.contains("1")) {
                String temp = op.split(" ")[1];
                stack.offerFirst(Integer.parseInt(temp));
            } else if(op.contains("2")) {
                stack.pollFirst();
            } else if(op.contains("3")) {
                Integer max1 = stack.stream().mapToInt(i -> i).max().getAsInt();
                max.add(max1);
               // max.add(Collections.max(stack)); // Not recommended.
               // System.out.println(max);
            }
        });
        return max;
    }
}
