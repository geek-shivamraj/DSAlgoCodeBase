package com.geek.ds.stack.arrayBased;

public class DynamicArrayStack {
    public static final int CAPACITY = 16;
    public static final int MIN_CAPACITY = 1 << 15;
    protected int capacity;
    protected int top = -1;
    protected int[] stackRep;
    public DynamicArrayStack(){
        this(CAPACITY);
    }

    public DynamicArrayStack(int cap) {
        capacity = cap;
        stackRep = new int[capacity];
    }

    public void push(int data){
        if(top + 1 == capacity)
            expand();
        stackRep[++top] = data;
    }

    public int pop() throws Exception {
        if(top < 0)
            throw new Exception("Stack is empty.");
        int data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        shrink();
        return data;
    }

    private void shrink() {
        int length = top + 1;
        if(length <= MIN_CAPACITY || top << 2 >= length)
            return;
        length = length + (top<<1);
        if(top < MIN_CAPACITY)
            length = MIN_CAPACITY;
        int[] newStack = new int[length];
        System.arraycopy(stackRep, 0, newStack, 0, top + 1);
        stackRep = newStack;
        this.capacity = length;
    }

    private void expand() {
        int length = top + 1;
        int[] newStack = new int[length<<1]; // length * 2
        System.arraycopy(stackRep, 0, newStack, 0, length);
        stackRep = newStack;
        this.capacity = this.capacity<<1;
    }

    public int top() throws Exception {
        if(top < 0)
            throw new Exception("Stack is empty.");
        return top;
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void traverseStack(){
        System.out.print("Stack: [");
        for(int i = 0; i < size(); i++) {
            System.out.print(stackRep[i] + "(" + i + ")");
            if(i != size() - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
