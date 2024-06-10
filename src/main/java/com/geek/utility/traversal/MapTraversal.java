package com.geek.utility.traversal;

import java.util.Iterator;
import java.util.Map;

public class MapTraversal {

    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1,"abc", 2, "def", 3, "ghi");

        // Stream API
        map.keySet().stream().forEach(key -> System.out.println("Key: " + key + ", Value: " + map.get(key)));
        System.out.println("-----------------------------------------");

        map.entrySet().stream().forEach(entry -> System.out.println("Key: " + entry.getKey()
                + ", Value: " + entry.getValue()));
        System.out.println("-----------------------------------------");
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("-----------------------------------------");

        // Enhanced for loop
        for(Map.Entry<Integer, String> mapElement : map.entrySet())
            System.out.println("Key: " + mapElement.getKey() + ", Value: " + mapElement.getValue());
        System.out.println("-----------------------------------------");

        for(Integer key: map.keySet())
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        System.out.println("-----------------------------------------");

        // Iterator
        for(Iterator<Integer> keyset = map.keySet().iterator(); keyset.hasNext();){
            Integer key = keyset.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        System.out.println("-----------------------------------------");

    }
}
