package com.geek.code.linkedList;

import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.List;

public class GFG2_checkCircularLL {
    public static void main(String[] args) {
        ListNode head = new SinglyLinkedList().insertList(List.of(1, 2, 3, 4, 5));
        System.out.println(isCircular(head));
    }

    private static boolean isCircular(ListNode head) {
        if(head == null)
            return true;
        boolean circularFlag = true;
        for(ListNode current = head; current.next != head; current = current.next) {
            if(current.next == null){
                circularFlag = false; break;
            }
        }
        return circularFlag;
    }
}
