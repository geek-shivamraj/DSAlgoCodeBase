package com.geek.code.linkedList;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

public class HR1_ReverseSinglyLL {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtEnd(1);
        sll.insertAtEnd(2);
        sll.insertAtEnd(3);
        sll.insertAtEnd(4);
        ListNode head = reverseSinglyLinkedList(sll.head);
        sll.traverseSLL(head);

    }
    private static ListNode reverseSinglyLinkedList(ListNode head) {
        if(head == null)
            return head;
        ListNode current = head;
        while(current.next != null) {
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }

}
