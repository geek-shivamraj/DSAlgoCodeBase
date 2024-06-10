package com.geek.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tech {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "aac", "ccc");

        Map <Character, Integer> freq = new HashMap<>();
        input.stream().forEach(s -> {
            s.chars().forEach(c -> {
                Character ch = (char) c;
                if(freq.containsKey(ch)) {
                   int val = freq.get(ch);
                   freq.put(ch, ++val);
                } else {
                    freq.put(ch, 1);
                }
            });
        });
        System.out.println(freq);
    }
}
