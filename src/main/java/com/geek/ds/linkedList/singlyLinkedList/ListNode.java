package com.geek.ds.linkedList.singlyLinkedList;

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
