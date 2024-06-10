package com.geek.ds.stack.arrayBased;

public class FixedSizeArrayStack {
    public static final int CAPACITY = 10;
    protected int capacity;
    protected int[] stackRep;
    protected int top = -1;
    public FixedSizeArrayStack() {  this(CAPACITY); }
    public FixedSizeArrayStack(int cap) {
        capacity = cap; stackRep = new int[capacity];
    }

    public void push(int data) throws Exception {
        if(size() == capacity)
            throw new Exception("Stack is full.");
        stackRep[++top] = data;
    }

    public int pop() throws Exception {
        if(top < 0)
            throw new Exception("Stack is empty.");
        int data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        return data;
    }

    public int top() throws Exception {
        if(top < 0)
            throw new Exception("Stack is empty.");
        return stackRep[top];
    }

    public void traverseStack() {
        System.out.print("Stack: [");
        for(int i = 0; i < size(); i++) {
            System.out.print(stackRep[i] + "(" + i + ")");
            if(i != size() - 1)
                System.out.print(", ");
        }
        System.out.println("]");

    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }
}
