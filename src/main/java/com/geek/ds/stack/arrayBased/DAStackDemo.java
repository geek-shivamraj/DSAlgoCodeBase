package com.geek.ds.stack.arrayBased;

public class DAStackDemo {
    public static void main(String[] args) throws Exception {
        DynamicArrayStack stack1 = new DynamicArrayStack(20);
        System.out.println("Top: " + stack1.top + ", Capacity: " + stack1.capacity + ", Size: " + stack1.size());
        DynamicArrayStack stack2 = new DynamicArrayStack();
        System.out.println("Top: " + stack2.top + ", Capacity: " + stack2.capacity + ", Size: " + stack2.size());

        stack2.push(1); stack2.push(2); stack2.push(3);
        stack2.traverseStack();
        System.out.println("Top: " + stack2.top + ", Capacity: " + stack2.capacity + ", Size: " + stack2.size());
//        System.out.println("Pop: " + stack2.pop());
//        stack2.traverseStack();
//        System.out.println("Pop: " + stack2.pop());
//        stack2.traverseStack();
//        System.out.println("Pop: " + stack2.pop());
//        stack2.traverseStack();
//        System.out.println("Pop: " + stack2.pop());

    }
}
