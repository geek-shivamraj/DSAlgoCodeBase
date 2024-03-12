package com.geek.hackerrank;

public class FormattedDecimal {
    public static void main(String[] args) {
        double count = 10; int n = 3;
        double d = count/n;
        System.out.println(d);
        System.out.format("%.6f\n", count/n);
        System.out.format("%.6f\n", count/n);
    }
}
