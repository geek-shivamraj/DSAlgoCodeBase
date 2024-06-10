package com.geek.ds.queues;

public class LinkedQueueDemo {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enQueue(11);
        queue.enQueue(22);
        queue.traverseQueue();
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();
        queue.deQueue();
    }
}
