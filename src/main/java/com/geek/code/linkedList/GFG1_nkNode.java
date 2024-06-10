package com.geek.code.linkedList;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.List;

public class GFG1_nkNode {
    public static void main(String[] args) {
        ListNode head = new SinglyLinkedList().insertList(List.of(52, 55, 100, 33));
        head = new SinglyLinkedList().insertList(
                List.of(88, 57, 44, 92, 28, 66, 60, 37, 33, 52, 38, 29, 76, 8, 75));
        System.out.println("N/kth Node: " + nkNode(head, 2));
    }

    private static int nkNode(ListNode head, int k) {
        int n = 0;
        for(ListNode current = head; current != null; current = current.next)
            n++;
        int nk = n%k == 0 ? n/k : n/k + 1;
        System.out.println(nk);
        ListNode current = head;
        for(int index = 1; index != nk; index++)
            current = current.next;
        return current.data;
    }
}
