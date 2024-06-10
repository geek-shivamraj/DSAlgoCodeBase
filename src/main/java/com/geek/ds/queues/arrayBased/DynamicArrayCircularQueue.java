package com.geek.ds.queues.arrayBased;

public class DynamicArrayCircularQueue {

    private static int CAPACITY = 16;
    public static int MIN_CAPACITY = 1 << 15;

    private int[] queue;
    private int front, rear, size;

    public DynamicArrayCircularQueue(){
        this(CAPACITY);
    }

    public DynamicArrayCircularQueue(int capacity) {
        queue = new int[capacity];
        front = 0; rear = 0; size = 0;
    }

    public void enQueue(int data) {
        if(size == CAPACITY)
            expand();
        queue[rear] = data;
        rear = (rear + 1) % CAPACITY;
        size++;
    }

    public int deQueue() {
        if(size == 0)
            throw new IllegalStateException("Queue is Empty: Underflow");
        int data = queue[front % CAPACITY];
        queue[front] = Integer.MIN_VALUE;
        front = (front + 1) % CAPACITY;
        size--;
        shrink();
        return data;
    }

    private void shrink() {
        int length = size;
        if(length <= MIN_CAPACITY || length << 2 >= length)
            return;
//        if(length < MIN_CAPACITY)
    }

    private void expand() {
        int length = size();
        int[] newQueue = new int[length << 1];
        for(int i = front; i <= rear; i++)
            newQueue[i - front] = queue[i % CAPACITY];
        queue = newQueue;
        front = 0;
        rear = size - 1;
        CAPACITY *= 2;
    }

    public void traverseQueue() {
        System.out.print("Queue: [");
        for(int i = 0; i < size; i++) {
            System.out.print(queue[(front + i)%CAPACITY]);
            if(i != size - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public int size() {
        return size;
    }
}
