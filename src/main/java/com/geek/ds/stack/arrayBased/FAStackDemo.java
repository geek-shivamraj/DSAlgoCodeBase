package com.geek.ds.stack.arrayBased;

public class FAStackDemo {
    public static void main(String[] args) throws Exception {
        FixedSizeArrayStack stack1 = new FixedSizeArrayStack(20);
        System.out.println("Top: " + stack1.top + ", Capacity: " + stack1.capacity + ", Size: " + stack1.size());
        FixedSizeArrayStack stack2 = new FixedSizeArrayStack();
        System.out.println("Top: " + stack2.top + ", Capacity: " + stack2.capacity + ", Size: " + stack2.size());

        stack2.push(1); stack2.push(2); stack2.push(3);
        stack2.traverseStack();
        System.out.println("Top: " + stack2.top + ", Capacity: " + stack2.capacity + ", Size: " + stack2.size());
        System.out.println("Pop: " + stack2.pop());
        stack2.traverseStack();
        System.out.println("Pop: " + stack2.pop());
        stack2.traverseStack();
        System.out.println("Pop: " + stack2.pop());
        stack2.traverseStack();
        System.out.println("Pop: " + stack2.pop());

    }
}
