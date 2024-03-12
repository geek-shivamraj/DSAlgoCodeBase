package com.geek.ds.complexity;

public class Main {
    public static void main(String[] args) {
        function1(6);
    }

    public static void function1(int n) {
        int i = 1, s = 1;
        while(s <= n) {
            i++;
            s = s+i;
            //System.out.println("*");
            System.out.println("i: " + i + ", s: " + s);
        }
    }
}