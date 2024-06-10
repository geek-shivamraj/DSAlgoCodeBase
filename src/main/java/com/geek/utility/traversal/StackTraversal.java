package com.geek.utility.traversal;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTraversal {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.offerFirst(1);
        stack.offerFirst(2);
        stack.offerFirst(3);
        System.out.println(stack);
        int po = (int) Math.pow(2, 4);
        System.out.println(po);
    }
}
