package com.geek.code.linkedList;

import com.geek.ds.linkedList.doublyLinkedList.DLLNode;
import com.geek.ds.linkedList.doublyLinkedList.DoublyLinkedList;
import com.geek.ds.linkedList.singlyLinkedList.ListNode;
import com.geek.ds.linkedList.singlyLinkedList.SinglyLinkedList;

public class HR2_ReverseDoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertTail(1);
        dll.insertTail(2);
        dll.insertTail(3);
        dll.insertTail(4);
        DLLNode head = reverseDoublyLinkedList(dll.head);
        dll.traverseDLLForward(head);
        //dll.traverseDLLBackward(head);

    }
    private static DLLNode reverseDoublyLinkedList(DLLNode head) {
        if(head == null)
            return head;
        DLLNode current = head;
//        while(current.next != null) {
//            ListNode temp = current.next;
//            current.next = temp.next;
//            temp.next = head;
//            head = temp;
//        }
        return head;
    }

}
