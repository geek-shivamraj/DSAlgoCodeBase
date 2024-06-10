package com.geek.code.linkedList.mediumHard;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

public class GFG1_modifyLinkedList {
    public static void main(String[] args){
        ListNode head = new SinglyLinkedList().insertList(List.of(10,4,3,6));
        head = modifyLinkedList(head);
        System.out.print("head --> ");
        for(ListNode current = head; current != null; current = current.next) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("null");
    }

    private static ListNode modifyLinkedList(ListNode head) {
        ListNode mid = null;
        if(head == null)
            return head;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = Objects.isNull(fast) ? slow : slow.next;

        Deque<ListNode> stack = new ArrayDeque<>();
        for(ListNode current = mid; current != null; current = current.next)
            stack.offerFirst(current);

        ListNode midItr = mid;
        for(ListNode current = head; current != mid && midItr != null; current = current.next) {
            ListNode temp = stack.pollFirst();
            int currentData = current.data;
            if(temp != null) {
                current.data = temp.data - current.data;
                temp.data = currentData;
            }
            midItr = midItr.next;
        }
        return head;
    }
}
