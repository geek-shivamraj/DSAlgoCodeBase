package com.geek.code;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class StringPermutation {
    public static void main(String[] args) {
        String input = "ABCD";
//        printAllPermutation(input);
        findPermutation(input, 0, input.length()-1);
    }

//    private static void printAllPermutation(String str) {
//        int n = str.length();
//        Set<String> perm = new HashSet<>();
//        perm.add(str);
//        for(int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                    str = swap(str, i, j);
//                System.out.print(str + ", ");
////                str = swap(str, j, j+1);
////                System.out.println(str);
////                System.out.println(new StringBuffer(str).reverse());
//            }
//        }
//            for(int j = i + 1; j < n; j++) {
//                if(i != pos) {
//                    String output = swap(input, i, pos);
//                    perm.add(output);
//                    perm.add(new StringBuilder(output).reverse().toString());
//                }
//                pos++;
//            }
//        }
//    }

    private static String swap(String input, int i, int pos) {
        StringBuffer sb = new StringBuffer(input);
        char temp = input.charAt(i);
        sb.setCharAt(i, input.charAt(pos));
        sb.setCharAt(pos, temp);
//        System.out.print("Sb: " + sb);
        return sb.toString();
    }

    private static void findPermutation(String str, int start, int end) {
        if(start == end){
            System.out.println(str);
            return;
        }
        for(int i = start; i <= end; i++) {
            str = swap(str, start, i);
            findPermutation(str, start + 1, end);
            // backtracking
//            str = swap(str, start, i);
        }
    }

}
