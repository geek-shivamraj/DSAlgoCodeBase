package com.geek.utility.traversal;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTraversal {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Using List class toString() method
        System.out.println(list);

        // stream forEach, forEachOrdered
        System.out.print("List stream forEach: ");
        list.stream().forEach(i -> System.out.print(i + ", "));
        System.out.println();

        System.out.print("List stream forEachOrdered: ");
        list.stream().forEachOrdered(i -> System.out.print(i + ", "));
        System.out.println();

        // Iterable forEach
        System.out.print("Iterable forEach method: ");
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // Looping
        System.out.print("Basic for loop: ");
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + ", ");
        System.out.println();

        // Forward Iterator
        System.out.print("Forward List Iterator: ");
        for(Iterator<Integer> itr = list.listIterator(); itr.hasNext();)
            System.out.print(itr.next() + ", ");
        System.out.println();

        System.out.print("Backward List Iterator: ");
        for(ListIterator<Integer> litr = list.listIterator(list.size()); litr.hasPrevious();)
            System.out.print(litr.previous() + ", ");
        System.out.println();

        // Enhanced for loop
        System.out.print("Enhanced for Loop: ");
        for(Integer i : list)
            System.out.print(i + ", ");
        System.out.println();

    }

}
