package com.geek.ibm;

public class CaseCount {
    public static void main(String[] args) {

    }

    public static int camelcase(String s) {
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }

    public static int camelcaseRegex(String s) {
        return s.split("[A-Z]").length;
    }
}
