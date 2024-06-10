package com.geek.impQuestion.string;

import java.util.Scanner;

/*
Given a string: s and an integer: k, Write a function so that it finds the
lexicographically smallest and largest substrings of length k.
Input:
welcometojava
3
Output:
ava
wel
 */
public class LargestSmallestSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String output = getSmallestAndLargest(s, k);
        System.out.println(output);
    }
    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for(int i=1; i<s.length()-k+1; i++){
            String input = s.substring(i, k+i);

            if(input.compareTo(largest)>0)
                largest=input;

            if(input.compareTo(smallest)<0)
                smallest=input;
        }
        return smallest + "\n" + largest;
    }
}
