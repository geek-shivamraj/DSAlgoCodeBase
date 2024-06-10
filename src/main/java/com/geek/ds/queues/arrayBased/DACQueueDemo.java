package com.geek.ds.queues.arrayBased;

public class DACQueueDemo {
    public static void main(String[] args) {
        FixedArrayCircularQueue queue = new FixedArrayCircularQueue();
        queue.enQueue(22);
        queue.enQueue(33);
        queue.enQueue(44);
        queue.enQueue(55);
        queue.enQueue(66);
        System.out.println("Size: " + queue.size());
        queue.traverseQueue();
        queue.enQueue(77);
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();

        queue.enQueue(88);
        queue.traverseQueue();

        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();

    }
}
