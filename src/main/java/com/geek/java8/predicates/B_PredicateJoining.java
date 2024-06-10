package com.geek.java8.predicates;

import java.util.function.Predicate;

// and(), or(), negate()
public class B_PredicateJoining {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 24, 30};
        Predicate<Integer> p1 = i -> i > 10;
        m1(p1, x);
        Predicate<Integer> p2 = i -> i % 2 == 0;
        m1(p2, x);

        System.out.println("The numbers not greater than 10: ");
        m1(p1.negate(), x);

        System.out.println("The numbers greater than 10 and Even: ");
        m1(p1.and(p2), x);

        System.out.println("The numbers greater than 10 or even: ");
        m1(p1.or(p2), x);
    }

    public static void m1(Predicate<Integer> p, int[] x) {
        for(int i : x) {
            if(p.test(i))
                System.out.print(i + ", ");
        }
        System.out.println();
    }
}
