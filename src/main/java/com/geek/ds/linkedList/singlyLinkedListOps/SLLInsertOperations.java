package com.geek.ds.linkedList.singlyLinkedListOps;

import com.geek.ds.linkedList.ListNode;
import com.geek.ds.linkedList.SinglyLinkedList;

public class SLLInsertOperations {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // insert At Beginning
//        singlyLinkedList.insertAtBegin(new ListNode(3));
//        singlyLinkedList.insertAtBegin(new ListNode(2));
//        singlyLinkedList.insertAtBegin(new ListNode(1));
//        System.out.println("Size: " + singlyLinkedList.size());
//        singlyLinkedList.traverseSinglyLinkedList();

        // insert At End
//        singlyLinkedList.insertAtEnd(new ListNode(8));
//        singlyLinkedList.insertAtEnd(new ListNode(9));
//        singlyLinkedList.insertAtEnd(new ListNode(10));
//        singlyLinkedList.traverseSinglyLinkedList();

//        // insert At Position (1 to N)
        singlyLinkedList.insertAtPosition(new ListNode(11), 1);
        singlyLinkedList.insertAtPosition(new ListNode(12), singlyLinkedList.size());
        singlyLinkedList.insertAtPosition(new ListNode(13), 3);
        singlyLinkedList.insertAtPosition(new ListNode(14), singlyLinkedList.size() + 9);
        singlyLinkedList.traverseSinglyLinkedList();

    }
}
