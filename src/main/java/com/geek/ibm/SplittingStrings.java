package com.geek.ibm;

import java.util.Scanner;

public class SplittingStrings {
    public static String stringReceived(String S,int P) {

        //StringBuffer sb = new StringBuffer(S);
        String result1 = findString(S, P);

        return result1;
    }


    private static String findString(String sb, int p) {

        if(p == 0)
            return sb;

        findString(sb.substring(0, sb.length()/2), p-1);
        findString(sb.substring(sb.length()/2, sb.length()), p-1);
        return sb;
    }

    public static void main(String[] args) {
        //INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int P = sc.nextInt();
        sc.close();

        //OUTPUT [uncomment & modify if required]
        System.out.print(stringReceived(S,P));
    }

}

