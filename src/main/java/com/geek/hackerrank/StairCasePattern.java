package com.geek.hackerrank;

public class StairCasePattern {

    public static void main(String[] args) {
        int n = 6;
        for(int i =1 ;i <= n ; i ++){
            for(int j =1 ;j <= n ; j ++){
                System.out.print(j<=(n- i)?" ":"#");
            }
            System.out.println();
        }

//        for(int i = 0; i < n; i++) {
//            int j = 0;
//            for(;j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for(;j < n; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }
    }
}
