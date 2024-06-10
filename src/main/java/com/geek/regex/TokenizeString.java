package com.geek.regex;

import java.util.Scanner;

public class TokenizeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        input = input.trim();
        if(input.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tokens = input.split("[ !,?._'@\"]+");
        System.out.println(tokens.length);

        for(int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
    }
}
