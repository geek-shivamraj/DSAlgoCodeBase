package com.geek.ds.linkedList.singlyLinkedList;

import java.util.List;

public class SinglyLinkedList {
    public ListNode head;

    public void removeMatched(int data) {
        if(head == null)
            return;
        ListNode prev = null;
        for(ListNode current = head; current != null; current = current.next) {
            if(current.data == data) {
                if(prev != null)
                    prev.next = current.next;
                else
                    head = current.next;
            } else
                prev = current;
        }
    }
//    public void removeMatched(int data) {
//        if(head == null)
//            return;
//
//        ListNode current = head;
//        ListNode prev = null;
//        while(current != null) {
//            if(current.data == data) {
//                if(prev == null) {
//                    ListNode node = current;
//                    current = current.next;
//                    node.next = null;
//                    head = current;
//                } else {
//                    ListNode node = prev.next;
//                    prev.next = node.next;
//                    node.next = null;
//                    current = prev.next;
//                }
//            } else {
//                prev = current;
//                current = current.next;
//            }
//        }
//    }

    public ListNode insertList(List<Integer> input) {
        input.stream().forEach(this::insertAtEnd);
        return head;
    }
    public ListNode removeFromPosition(int position) {
        position = position < 0 ? 0 : position; // This actually cover head.next == null, position == 0
        position = position >= size() ? size() - 1 : position;
        if(head == null)
            return null;

        if(head.next == null) {
            head = null; return null;
        }

        ListNode current = head;
        if(position == 0) {
            ListNode node = current;
            head = node.next; node.next = null;
            return node;
        }
        for(int index = 1; index < position; index++)
            current = current.next;

        ListNode node = current.next;
        current.next = node.next; node.next = null;
        return node;
    }

    public ListNode removeFromLast2pointer() {
        ListNode current = head;
        if(current == null)
            return null;
        if(current.next == null) {
            head = null;
            return current;
        }
        ListNode prev = null;
        for(;current.next != null; current= current.next, prev = current);
        ListNode node = current;
        prev.next = null;
        return node;
    }

    public ListNode removeFromLast() {
        ListNode current = head;
        if(current == null)
            return null;
        if(current.next == null) {
            head = null;
            return current;
        }
        for(;current.next.next != null; current=current.next);
        ListNode node = current.next;
        current.next = null;
        return node;
    }

    public ListNode removeFromBegin() {
        ListNode node = head;
        if(node != null) {
            head = node.next;
            node.next = null;
        }
        return node;
    }
    public void insertAtPosition(int data, int position) {
        ListNode node = new ListNode(data);
        position = position < 0 ? 0 : position;
        int size = size();
        position = position > size ? size : position;

        if(head == null || position == 0) {
            node.next = head; head = node; return;
        }
        ListNode current = head;
        for(int index = 1; index < position; index++)
            current = current.next;
        node.next = current.next;
        current.next = node;
    }

    public void insertAtEnd(int data) {
        ListNode node = new ListNode(data);
        if(head == null) {
            head = node;
            return;
        }
        ListNode current = head;
        for(; current.next != null; current = current.next);
        current.next = node;
    }

    public void insertAtBegin(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    public int size() {
        int size = 0;
        ListNode current = head;
        for(; current != null; current = current.next)
            size++;
        return size;
    }
    public void traverseSLL () {
        ListNode current = head;
        int index = 0;
        System.out.print("head --> ");
        for(;current != null; current = current.next) {
            System.out.print(current.data + "(" + index + ") --> ");
            index++;
        }
        System.out.println("null");
    }

    public void traverseSLL (ListNode current) {
        int index = 0;
        System.out.print("head --> ");
        for(;current != null; current = current.next) {
            System.out.print(current.data + "(" + index + ") --> ");
            index++;
        }
        System.out.println("null");
    }
}
