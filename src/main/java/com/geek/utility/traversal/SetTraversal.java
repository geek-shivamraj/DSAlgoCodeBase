package com.geek.utility.traversal;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetTraversal {

    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 2, 3, 4);

        // Using Set class toString() method
        System.out.println(set);

        // Using Iterator
        for(Iterator<Integer> itr = set.iterator(); itr.hasNext();)
            System.out.print(itr.next() + ", ");
        System.out.println();

        // Stream API
        set.stream().forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // forEach method
        set.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // We can't loop using basic for loop
        // Enhanced for loop
        for(Integer i : set)
            System.out.print(i + ", ");
        System.out.println();

    }
}
