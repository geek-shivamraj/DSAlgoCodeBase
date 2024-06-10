package com.geek.test;

//"AAD","AAZ","AAS","ABD","AAA","AAB","AAC","ADS","SSS","ZAD","ABC"

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("AAD","AAZ","AAS","ABD","AAA","AAB","AAC","ADS","SSS","ZAD","ABC");

        list.stream().sorted(Comparator.naturalOrder()).forEach(e -> System.out.print(e + ", "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + ", "));
    }
}
