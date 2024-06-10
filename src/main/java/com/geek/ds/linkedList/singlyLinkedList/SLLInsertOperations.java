package com.geek.ds.linkedList.singlyLinkedList;

public class SLLInsertOperations {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // insert At Beginning
//        singlyLinkedList.insertAtBegin(3);
//        singlyLinkedList.insertAtBegin(2);
//        singlyLinkedList.insertAtBegin(1);
//        System.out.println("Size: " + singlyLinkedList.size());
//        singlyLinkedList.traverseSLL();

        // insert At End
//        singlyLinkedList.insertAtEnd(8);
//        singlyLinkedList.insertAtEnd(9);
//        singlyLinkedList.insertAtEnd(10);
//        singlyLinkedList.traverseSLL();

        // insert At Position (1 to N)
        singlyLinkedList.insertAtPosition(11, -44);
        singlyLinkedList.insertAtPosition(12, 44);
        singlyLinkedList.insertAtPosition(13, 1);
        singlyLinkedList.insertAtPosition(14, 2);
        singlyLinkedList.traverseSLL();

    }
}
