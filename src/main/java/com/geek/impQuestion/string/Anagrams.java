package com.geek.impQuestion.string;

import java.util.*;
import java.util.stream.Collectors;

public class Anagrams {

    static boolean isAnagramSort(String a, String b) {
        char[] c = a.toLowerCase().toCharArray();
        char[] h = b.toLowerCase().toCharArray();
        Arrays.sort(c);
        Arrays.sort(h);
        String s=String.valueOf(c);
        String t=String.valueOf(h);
        if( s.equals(t)){
            return true;
        }
        return false;
    }
    private static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i < a.length(); i++) {
//            if(map.get(a.charAt(i)) == null) {
//                map.put(a.charAt(i), 1);
//            } else {
//                Integer val = map.get(a.charAt(i));
//                map.put(a.charAt(i), ++val);
//            }
//        }
        List<Character> aList = a.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        Map<Character, Long> map = aList.stream().collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println("Map1: "+ map);
        for(int i = 0; i < b.length(); i++) {
            if(!map.keySet().contains(b.charAt(i))) {
                return false;
            }
            Long val = map.get(b.charAt(i));
            map.put(b.charAt(i), --val);
        }
        if(map.values().stream().anyMatch(v -> v != 0))
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }


}
