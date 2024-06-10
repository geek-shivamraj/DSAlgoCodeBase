//package com.geek.ds.linkedList;
//
//public class SinglyLinkedListOld {
//
//    public ListNode head;
//    private int length = 0;
//    public SinglyLinkedListOld() {}
//
//    public int size() {
//        return length;
//    }
//
//    public void reversePrint1() {
//        if(head == null || head.getNext() == null)
//            return;
//
//        ListNode current = head;
//        while(current.getNext() != null) {
//            ListNode node = current.getNext();
//            current.setNext(node.getNext());
//            node.setNext(head);
//            head = node;
//        }
//    }
//
//    public void reversePrint2() {
//        ListNode current = head;
//        ListNode prev = null;
//        while(current != null) {
//            ListNode next = current.getNext();
//            current.setNext(prev);
//            prev = current;
//            current = next;
//        }
//        head = prev;
//    }
//
//    public void reverseRecurPrint1(ListNode current) {
//        if(current == null || current.getNext() == null)
//            return;
//
//        ListNode node = current.getNext();
//        current.setNext(node.getNext());
//        node.setNext(head);
//        head = node;
//        reverseRecurPrint1(current);
//    }
//
//
//    public void insertAtBegin(ListNode node) { // Complexity: O(n)
//        node.setNext(head);
//        head = node;
//        length++;
//    }
//    public void insertAtEnd(ListNode node) {
//        if(head == null) {
//            head = node; length++;
//            return;
//        }
//        ListNode current = head;
//        for(;current.getNext() != null; current = current.getNext());
//        current.setNext(node); length++;
//
////        while(current.getNext() != null) {
////            current = current.getNext();
////        }
////        current.setNext(node); length++;
//    }
//    public void oldInsertAtPosition(ListNode node, int position) {
//        if(position < 0)
//            position = 0;
//        if(position > length)
//            position = length;
//        System.out.println("Inserting at position: " + position);
//        if(position == 0) {
//            if(head != null) { node.setNext(head); }
//            head = node; length++;
//            return;
//        }
//
//        ListNode current = head;
//        // i = 0 insertion is already done so start from i = 1;
//        for(int i = 1; i < position; i++)
//            current = current.getNext();
//
//        node.setNext(current.getNext());
//        current.setNext(node);
//        length++;
//    }
//    public void insertAtPosition(ListNode node, int position) {
//        if(position < 0)
//            position = 0;
//        if(position > length)
//            position = length;
//
//        System.out.println("Inserting at position: " + position);
//        if(head == null || position == 0) {
//            node.setNext(head);
//            head = node; length++;
//            return;
//        }
//        ListNode current = head;
//        for(int index = 0; index < position && current.getNext() != null; index++)
//            current = current.getNext();
//        node.setNext(current.getNext());
//        current.setNext(node); length++;
//    }
//    public ListNode removeFromBegin() {
//        ListNode node = head;
//        if(node != null) {
//            head = node.getNext();
//            node.setNext(null);
//            length--;
//        }
//        return node;
//    }
//    public ListNode removeFromEnd() {
//        if(head == null)
//            return null;
//        ListNode node = head;
//        if(head.getNext() == null) {
//            head = null; length--;
//            return node;
//        }
//
//        ListNode current = head;
//        while(current.getNext().getNext() != null) {
//            current = current.getNext();
//        }
//        node = current.getNext();
//        current.setNext(null);
//        length--;
//        return node;
//    }
//
//    public void removeAtPosition(int position) {
//
//        if(position < 0)
//            position = 0;
//        if(position >= length)
//            position = length - 1;
//
//        if(head == null || head.getNext() == null) {
//            head = null;
//            return;
//        }
//
//        if(position == 0) {
//            ListNode node = head;
//            head = head.getNext();
//            node.setNext(null);
//            return;
//        }
//
//        ListNode current = head;
//        int index = 1;
//        for(; index < position && current.getNext().getNext() != null; index++)
//            current = current.getNext();
//
//        if(index == position) {
//            ListNode node = current.getNext();
//            current.setNext(node.getNext());
//            node.setNext(null);
//        }
//    }
//    public void removeMatched(int data) {
//        if(head == null) {
//            head = null;
//            return;
//        }
//
//        if(head.getNext() == null) {
//            if(head.getData() == data) {
//                head = null; length--;
//            }
//            return;
//        }
//
//        if(head.getData() == data) {
//            ListNode node = head;
//            head = head.getNext();
//            node.setNext(null);
//            length--;
//            return;
//        }
//
//        ListNode current = head;
//        for(;current.getNext().getData() != data && current.getNext().getNext() != null; current = current.getNext());
//
//        if(current.getNext().getData() == data) {
//            ListNode node = current.getNext();
//            current.setNext(node.getNext());
//            node.setNext(null);
//            length--;
//        }
//    }
//    public void traverseSinglyLinkedList() {
//        System.out.print("head --> ");
//        int index = 0;
//        ListNode currentNode = head;
//        for(;currentNode != null; currentNode = currentNode.getNext()) {
//            System.out.print(currentNode.getData() + "(" + index + ") --> ");
//            index++;
//        }
//        System.out.println("null");
//
//    }
//}
