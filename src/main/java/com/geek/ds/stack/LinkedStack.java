package com.geek.ds.stack;

import java.util.EmptyStackException;

public class LinkedStack {
    private ListNode top;

    public void push(int data) {
        ListNode node = new ListNode(data);
        node.next = top;
        top = node;
    }

    public int pop() throws EmptyStackException {
        if(top == null)
            throw new EmptyStackException();
        ListNode node = top;
        top = top.next;
        node.next = null;
        return node.data;
    }

    public int peek() throws EmptyStackException {
        if(top == null)
            throw new EmptyStackException();
        return top.data;
    }

    public int size() {
        ListNode current = top;
        int length = 0;
        for(;current != null; current = current.next)
            length++;
        return length;
    }

    public void traverseStack() {
        ListNode current = top;
        System.out.print("top --> ");
        for(;current != null; current = current.next) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("null");
    }
}
