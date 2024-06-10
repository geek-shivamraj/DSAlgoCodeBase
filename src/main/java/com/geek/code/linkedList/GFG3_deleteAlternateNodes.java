package com.geek.code.linkedList;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.List;

public class GFG3_deleteAlternateNodes {
    public static void main(String[] args) {
        ListNode head = new SinglyLinkedList().insertList(List.of(1, 2, 3, 4, 5, 6));
        deleteAlternate(head);
        System.out.print("head --> ");
        for(ListNode current = head; current != null; current = current.next) {
            System.out.print(current.data + " --> ");
        }
        System.out.println(" --> null");
    }

    private static void deleteAlternate(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode current = head;
        while(current != null && current.next != null) {
            ListNode temp = current.next;
            if(temp.next != null)
                current.next = temp.next;
            else
                current.next = null;
            current = current.next;
        }
    }

}
