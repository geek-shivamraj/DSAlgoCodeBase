package com.geek.algorithm;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.List;

public class B_LinkedListSlowFastPtr {
    public static void main(String[] args) {
        // length of linked list > 1
        ListNode head = new SinglyLinkedList().insertList(List.of(1, 3));
        head = insertInMidSlowFast(head, 2);
        System.out.print("head --> ");
        for(ListNode current = head; current != null; current = current.next) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("null");
    }
    public static ListNode insertInMidSlowFast(ListNode head, int data) {
        ListNode node = new ListNode(data);
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node.next = slow.next;
        slow.next = node;
        return head;
    }
}
