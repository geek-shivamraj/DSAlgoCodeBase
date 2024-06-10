package com.geek.utility.string;

public class StringConstructors {

    public static void main(String[] args) {

        String str1 = "Shivam";
        String str2 = new String("Shivam");
        String str3 = new String(new char[] {'a', 'b', 'c'});
        String str4 = new String(new char[] {'s', 'h', 'i', 'v', 'a', 'm'}, 2, 3); // iva
        String str5 = new String(new StringBuffer("sbuffer"));
        String str6 = new String(new StringBuilder("sbuilder"));
        // Print the String with ASCII characters with value 65, 66, 67,68
        String str7 = new String(new int[] {65, 66, 67, 68}, 0, 4); // ABCD

        String str8 = new String(new byte[] {65, 66, 67, 68});  // ABCD

        System.out.println(str8);
    }
}
