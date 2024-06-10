package com.geek.ds.queues;

public class LinkedQueue {
    private ListNode front, rear;
    private int size;

    public void enQueue(int data) {
        ListNode node = new ListNode(data);
        if(front == null)
            front = node;
        else
            rear.next = node;
        rear = node;
        size++;
    }

    public int deQueue() {
        if(front == null)
            throw new IllegalStateException("Queue is empty: Underflow.");
        ListNode node = front;
        front = front.next;
        node.next = null;
        return node.data;
    }

    public void traverseQueue() {
        ListNode current = front;
        System.out.print("front --> ");
        for(;current != null; current = current.next){
            System.out.print(current.data + " --> ");
        }
        System.out.println("null");
    }

}
