package com.geek.code.linkedList.mediumHard;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

public class GFG1_segregateEvenOddNodes {
    public static void main(String[] args){
        ListNode head = new SinglyLinkedList().insertList(List.of(10,4,3,6));
        head = segregateEvenOddNodes(head);
        System.out.print("head --> ");
        for(ListNode current = head; current != null; current = current.next) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("null");
    }

    private static ListNode segregateEvenOddNodes(ListNode head) {
        ListNode current = head;

        return head;
    }

}
