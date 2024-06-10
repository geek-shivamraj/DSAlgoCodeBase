package com.geek.java8;

import java.util.Scanner;

/* Input:
java 100
cpp 65
python 50
 */

public class FormattedString {
    public static void main(String[] args) {

        double mint = 1234.12345;
        float  sum  = 1234.12345f;
        System.out.printf("%,.3f :: %,.5f", mint, sum);
        System.out.println();
        System.out.printf("%.2f", mint);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}
