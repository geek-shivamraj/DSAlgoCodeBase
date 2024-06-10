package com.geek.ds.linkedList.doublyLinkedList;

public class DLLInsertOps {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert at position
        dll.insert(1, 22);
        dll.insert(3, 1);
        dll.insert(2, 1);
        dll.insert(4, 1);

        // Insert at Tail
//        dll.insertTail(1);
//        dll.insertTail(2);
//        dll.insertTail(3);
//        dll.insertTail(4);

        // Insert at Head
//        dll.insertHead(4);
//        dll.insertHead(3);
//        dll.insertHead(2);
//        dll.insertHead(1);
        dll.traverseDLLForward();
        dll.traverseDLLBackward();
    }
}
