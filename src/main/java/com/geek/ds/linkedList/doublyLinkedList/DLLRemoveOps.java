package com.geek.ds.linkedList.doublyLinkedList;

public class DLLRemoveOps {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertTail(1);
        dll.insertTail(2);
        dll.insertTail(3);
        System.out.println("Removed Data: " + dll.removeAtPosition(1));
        System.out.println("Removed Data: " + dll.removeAtPosition(12));
        dll.traverseDLLForward();
        dll.traverseDLLBackward();

        // Remove Matched
//        dll.insertTail(2);
//        dll.insertTail(2);
//        dll.insertTail(3);
//        dll.insertTail(4);
//        dll.insertTail(3);
//        dll.traverseDLLForward();
//        dll.traverseDLLBackward();
//        dll.removeMatched(2);
//        dll.traverseDLLForward();
//        dll.traverseDLLBackward();


        // Remove from Tail
//        dll.insertTail(1);
//        dll.insertTail(2);
//        dll.insertTail(3);
//        dll.insertTail(4);
//        System.out.println("Removed Head: " + dll.removeTail());
//        System.out.println("Removed Head: " + dll.removeTail());
//        System.out.println("Removed Head: " + dll.removeTail());
//        System.out.println("Removed Head: " + dll.removeTail());
//        System.out.println("Removed Head: " + dll.removeTail());

        // Remove from Head
//        dll.insertTail(1);
//        dll.insertTail(2);
//        dll.insertTail(3);
//        dll.traverseDLLForward();
//        dll.traverseDLLBackward();
//        System.out.println("Removed Head: " + dll.removeHead());
//        System.out.println("Removed Head: " + dll.removeHead());
//        System.out.println("Removed Head: " + dll.removeHead());
//        System.out.println("Removed Head: " + dll.removeHead());

//        dll.traverseDLLForward();
//        dll.traverseDLLBackward();
    }
}
