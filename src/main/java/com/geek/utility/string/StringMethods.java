package com.geek.utility.string;

public class StringMethods {

    public static void main(String[] args) {
        String str1 = "crunchyroll";

        char[] arr = str1.toCharArray();
        for (char c:arr)
            System.out.print(c + ", ");
        System.out.println();
        System.out.println("Contains char ch: " + str1.contains("ch"));
        String str2 = str1.replace('c', 'k');
        System.out.println("Str2: " + str2);
        String str3 = str1.replace("cr", "qo");
        System.out.println("Str3: " + str3);
        String str4 = str1.replaceAll("c", "k"); //regex for replacement of all occurence;
        System.out.println("Str4: " + str4);
        String str5 = str1.replaceFirst("r", "f");
        System.out.println("Str5: " + str5);
        String str6 = str1.concat("-concat");
        System.out.println(str6);
        String str7 = str1.trim();
        int val = str1.compareTo("shivam");
        int val1 = str1.compareToIgnoreCase("SHIVAM");
        System.out.println("CompareTo: " + val); // Some -ve val [i.e., cru.. < shi..



        System.out.println(str1.charAt(0)); // c
        System.out.println(str1.length());  //
        System.out.println(str1.isEmpty());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.getBytes());

    }
}
