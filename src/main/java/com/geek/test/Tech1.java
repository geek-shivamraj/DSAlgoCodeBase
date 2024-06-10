package com.geek.test;

import java.util.HashMap;
import java.util.Map;

public class Tech1 {
    public static void main(String[] s) {
        String input = "babcbab";
        System.out.println(checkPalindrome(input));

        Map<String, String> map = new HashMap<>();
//        map.put("1", "One");
//        map.put("1", "Two");
//        System.out.println(map);

        map.put(null, null);
        System.out.println(map);
        map.put(null, null);


    }

    private static boolean checkPalindrome(String input) {
        int i = 0, j = input.length()-1;
        while(i < j) {
            if(input.charAt(i) != input.charAt(j))
                return false;
            i++; j--;
        }
        String a = "ab";
        return true;
    }
}
