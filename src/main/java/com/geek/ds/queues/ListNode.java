package com.geek.ds.queues;

public class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
