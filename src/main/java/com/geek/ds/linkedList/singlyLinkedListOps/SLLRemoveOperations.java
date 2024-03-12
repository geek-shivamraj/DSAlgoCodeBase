package com.geek.ds.linkedList.singlyLinkedListOps;

import com.geek.ds.linkedList.ListNode;
import com.geek.ds.linkedList.SinglyLinkedList;

public class SLLRemoveOperations {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.insertAtEnd(new ListNode(1));
        singlyLinkedList.removeMatched(1);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.insertAtEnd(new ListNode(1));
        singlyLinkedList.insertAtEnd(new ListNode(2));
        singlyLinkedList.insertAtEnd(new ListNode(3));
        singlyLinkedList.removeMatched(1);
        singlyLinkedList.traverseSinglyLinkedList();

       // singlyLinkedList.removeAtPosition(55);
       // singlyLinkedList.traverseSinglyLinkedList();
//        singlyLinkedList.insertAtEnd(new ListNode(3));
//        singlyLinkedList.removeAtPosition(5);
//        singlyLinkedList.traverseSinglyLinkedList();



//        singlyLinkedList.removeMatched(5);
//        singlyLinkedList.traverseSinglyLinkedList();
//
//        singlyLinkedList.insertAtEnd(new ListNode(1));
//        singlyLinkedList.removeMatched(2);
//        singlyLinkedList.traverseSinglyLinkedList();
//
//        singlyLinkedList.removeMatched(1);
//        singlyLinkedList.traverseSinglyLinkedList();
//
//        singlyLinkedList.insertAtEnd(new ListNode(2));
//        singlyLinkedList.insertAtEnd(new ListNode(3));
//        singlyLinkedList.insertAtEnd(new ListNode(4));
//        singlyLinkedList.removeMatched(4);
//        singlyLinkedList.traverseSinglyLinkedList();

//        singlyLinkedList.removeMatched(3);
//        singlyLinkedList.traverseSinglyLinkedList();

        // Remove from end
//        singlyLinkedList.traverseSinglyLinkedList();
//        System.out.println("Removed element: " + singlyLinkedList.removeFromEnd());
//
//        singlyLinkedList.insertAtEnd(new ListNode(11));
//        System.out.println("Removed element: " + singlyLinkedList.removeFromEnd());
//        singlyLinkedList.traverseSinglyLinkedList();
//
//        singlyLinkedList.insertAtEnd(new ListNode(22));
//        singlyLinkedList.insertAtEnd(new ListNode(33));
//        System.out.println("Removed element: " + singlyLinkedList.removeFromEnd());
//        singlyLinkedList.traverseSinglyLinkedList();
//
//        singlyLinkedList.insertAtEnd(new ListNode(44));
//        singlyLinkedList.insertAtEnd(new ListNode(55));
//        System.out.println("Removed element: " + singlyLinkedList.removeFromEnd());
//        singlyLinkedList.traverseSinglyLinkedList();

        // remove from Begin
//        singlyLinkedList.removeFromBegin();
//        singlyLinkedList.traverseSinglyLinkedList();
//        singlyLinkedList.insertAtEnd(new ListNode(1));
//        singlyLinkedList.removeFromBegin();
//        singlyLinkedList.traverseSinglyLinkedList();
//        singlyLinkedList.insertAtEnd(new ListNode(2));
//        singlyLinkedList.insertAtEnd(new ListNode(3));
//        singlyLinkedList.removeFromBegin();
//        singlyLinkedList.traverseSinglyLinkedList();
//        singlyLinkedList.removeFromBegin();
//        singlyLinkedList.traverseSinglyLinkedList();
//        singlyLinkedList.removeFromEnd();

    }
}
