package com.geek.ds.linkedList.circularLinkedList;

public class CircularLinkedList {
    private CLLNode tail;

    public void addToHead(int data) {
        CLLNode node = new CLLNode(data);
        if(tail == null) {
            tail = node;
            tail.next = tail;
        } else {
            node.next = tail.next;
            tail.next = node;
        }
    }

    public void traverseCLL() {
        System.out.print("Circular LL: ");
        CLLNode nextTail = tail.next;
        while(nextTail != tail) {
            System.out.print(nextTail.data + " --> ");
            nextTail = nextTail.next;
        }
        System.out.println("tail: " + tail.data);
    }
}
