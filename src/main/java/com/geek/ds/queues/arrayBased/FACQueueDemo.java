package com.geek.ds.queues.arrayBased;

public class FACQueueDemo {
    public static void main(String[] args) {

        FixedArrayCircularQueue queue = new FixedArrayCircularQueue();
        queue.enQueue(11); queue.enQueue(22); queue.enQueue(33);
        queue.enQueue(44); queue.enQueue(55);
        //queue.traverseQueue();
        queue.enQueue(66);queue.enQueue(77);queue.enQueue(88);
        //queue.traverseQueue();
        queue.enQueue(99);
        queue.traverseQueue();
        //queue.traverseQueue();
        System.out.println("Deque: " + queue.deQueue());
        System.out.println("Deque: " + queue.deQueue());
        System.out.println("Deque: " + queue.deQueue());
        System.out.println("Deque: " + queue.deQueue());
        queue.traverseQueue();
//        queue.enQueue(33);
//        queue.enQueue(44);
//        queue.enQueue(55);
//        queue.enQueue(66);
//        queue.enQueue(33);
//        queue.enQueue(44);
//        queue.enQueue(55);
//        queue.enQueue(66);
//        queue.enQueue(33);
//        queue.enQueue(44);
//        queue.enQueue(55);
//        queue.enQueue(66);
//        queue.enQueue(33);
//        queue.enQueue(44);
//        queue.enQueue(55);
//        queue.enQueue(66);
//        queue.enQueue(33);
//        queue.enQueue(44);
//        queue.enQueue(55);
//        queue.enQueue(66);
//        FixedArrayCircularQueue queue = new FixedArrayCircularQueue();
//        queue.enQueue(22);
//        queue.enQueue(33);
//        queue.enQueue(44);
//        queue.enQueue(55);
//        queue.enQueue(66);
//        System.out.println("Size: " + queue.size());
//        queue.traverseQueue();
//        queue.enQueue(77);
//        System.out.println("Deque: " + queue.deQueue());
//        queue.traverseQueue();
//        System.out.println("Deque: " + queue.deQueue());
//        queue.traverseQueue();
//
//        queue.enQueue(88);
//        queue.traverseQueue();
//
//        System.out.println("Deque: " + queue.deQueue());
//        queue.traverseQueue();
//        System.out.println("Deque: " + queue.deQueue());
//        queue.traverseQueue();
//        System.out.println("Deque: " + queue.deQueue());
//        queue.traverseQueue();
//        System.out.println("Deque: " + queue.deQueue());
//        queue.traverseQueue();

    }
}
