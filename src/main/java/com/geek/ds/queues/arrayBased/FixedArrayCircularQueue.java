package com.geek.ds.queues.arrayBased;

public class FixedArrayCircularQueue {
    private static final int CAPACITY = 9;
    private int[] queue;
    private int front, rear, size, capacity;

    public FixedArrayCircularQueue(){
        this(CAPACITY);
    }

    public FixedArrayCircularQueue(int cap) {
        this.capacity = cap;
        queue = new int[capacity];
    }

    public void enQueue(int data) {
        if(size == capacity)
            throw new IllegalStateException("Queue is full: Overflow");
        queue[rear] = data;
        rear = (rear + 1) % CAPACITY;
        size++;
    }

    public int deQueue() {
        if(size == 0)
            throw new IllegalStateException("Queue is empty: Underflow");
        int data = queue[front];
        queue[front] = Integer.MIN_VALUE;
        front = (front + 1) % CAPACITY;
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public void traverseQueue() {
        System.out.print("Queue: [");
        for(int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % CAPACITY]);
            if(i != size - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
