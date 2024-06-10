package com.geek.coreConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTesting {
    public static void main(String[] args) {
        addRemoveOnConcurrentHashMapTest();
        System.out.println("*******************************");
        addRemoveOnSynchronizedHashMapTest();
    }

    private static void addRemoveOnConcurrentHashMapTest() {
        System.out.println("ConcurrentHashMapTest");
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "shivam");
        map.put(2, "raj");
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>(map);
        map.forEach((key, value) -> {
            System.out.println("Putting key: 3");
            concurrentMap.put(3, "Modification");
        });
        System.out.println(concurrentMap);
    }

    private static void addRemoveOnSynchronizedHashMapTest() {
        System.out.println("SynchronizedHashMapTest");
        Map <Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "shivam");
        map.put(2, "raj");
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        map.forEach((key, value) -> {
            System.out.println("Putting key: 3");
            synchronizedMap.put(3, "Modification");
        });
        System.out.println(synchronizedMap);
    }
}
