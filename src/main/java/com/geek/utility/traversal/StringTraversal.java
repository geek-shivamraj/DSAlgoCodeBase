package com.geek.utility.traversal;

import java.util.Scanner;

public class StringTraversal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // chars() returns IntStream (Here ch is integer
        // we need to typecast it
        System.out.print("Using chars() of String class: ");
        input.chars().forEach(ch -> {
                System.out.print((char) ch + ", ");
        });
        System.out.println();

        System.out.print("Enhanced for loop: ");
        for(char ch : input.toCharArray())
            System.out.print(ch + ", ");
        System.out.println();

        char[] inputArr = input.toCharArray();
        System.out.print("Basic for loop for char array: ");
        for(int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + ", ");
        }
        System.out.println();

        System.out.print("Basic for loop with charAt(): ");
        for(int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i) + ", ");
        }
        System.out.println();
    }
}
