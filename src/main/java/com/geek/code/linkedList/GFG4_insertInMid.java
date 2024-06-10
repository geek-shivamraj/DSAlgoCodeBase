package com.geek.code.linkedList;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.List;

public class GFG4_insertInMid {
    public static void main(String[] args) {
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
    public static ListNode insertInMid(ListNode head, int data) {
        ListNode node = new ListNode(data);
        int length = 0;
        for(ListNode current = head; current != null; current = current.next)
            length++;
        int pos = length%2 == 0 ? length/2 : length/2 + 1;
        int index = 1;
        ListNode current = head;
        for(; index < pos; index++)
            current = current.next;
        node.next = current.next;
        current.next = node;
        return head;

    }

}
