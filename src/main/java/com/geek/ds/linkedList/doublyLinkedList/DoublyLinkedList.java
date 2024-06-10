package com.geek.ds.linkedList.doublyLinkedList;

import java.util.LinkedList;

public class DoublyLinkedList {
    public DLLNode head;
    private DLLNode tail;
    private int length;

    public void insertHead(int data) {
        DLLNode node = new DLLNode(data);
        if(head == null) {
            head = tail = node; length++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        length++;
    }
    public void insertTail(int data) {
        DLLNode node = new DLLNode(data);
        if(head == null) {
            head = tail = node; length++;
            return;
        }
        node.prev = tail;
        tail.next = node;
        tail = node;
        length++;
    }

    public void insert(int data, int position) {
        position = Math.max(position, 0);
        position = Math.min(position, length);

        DLLNode node = new DLLNode(data);
        if(head == null) {
            head = tail = node; length++; return;
        }
        if(position == 0) {
            node.next = head;
            head.prev = node;
            head = node; length++; return;
        }
        if(position == length) {
            node.prev = tail;
            tail.next = node;
            tail = node; length++; return;
        }
        DLLNode current = head;
        for(int i = 1; i < position; i++)
            current = current.next;
        node.prev = current;
        node.next = current.next;
        // current.next is not null as position == length already handled
        current.next.prev = node;
        current.next = node;
        length++;
    }

    public int removeHead() {
        if(head == null)
            return Integer.MIN_VALUE;
        DLLNode node = head;
        if(head.next == null) {
            head = tail = null;
        } else {
            head = node.next;
            node.next = null; head.prev = null;
        }
        length--;
        return node.data;
    }

    public int removeTail() {
        if(head == null)
            return Integer.MIN_VALUE;
        DLLNode node = tail;
        if(tail.prev == null) {
            head = tail = null;
        } else {
            tail = node.prev;
            tail.next = null; node.prev = null;
        }
        length--;
        return node.data;
    }

    public void removeMatched(int data) {
        if(head == null)
            return;
        for(DLLNode current = head; current != null; current = current.next) {
            if(current.data == data) {
                if (current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next;
                if (current.next != null)
                    current.next.prev = current.prev;
                else
                    tail = tail.prev;
                length--;
            }
        }
    }

    public int removeAtPosition(int position) {
        position = position < 0 ? 0 : position;
        position = position > length ? length - 1 : position;

        int index = 0;
        for(DLLNode current = head; current != null; current = current.next) {
            if(index == position) {
                if(current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next;
                if(current.next != null)
                    current.next.prev = current.prev;
                else
                    tail = tail.prev;
                length--;
                return current.data;
            }
            index++;
        }
        return Integer.MIN_VALUE;
    }

    public void traverseDLLForward() {
        DLLNode current = head;
        System.out.print("DoublyLL Forward: head --> ");
        for(; current != null; current = current.next) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("tail");
    }

    public void traverseDLLForward(DLLNode head) {
        DLLNode current = head;
        System.out.print("DoublyLL Forward: head --> ");
        for(; current != null; current = current.next) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("tail");
    }

    public void traverseDLLBackward() {
        DLLNode current = tail;
        System.out.print("DoublyLL Backward: tail --> ");
        for(; current != null; current = current.prev) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("head");
    }

    public void traverseDLLBackward(DLLNode tail) {
        DLLNode current = tail;
        System.out.print("DoublyLL Backward: tail --> ");
        for(; current != null; current = current.prev) {
            System.out.print(current.data + " --> ");
        }
        System.out.println("head");
    }
}
