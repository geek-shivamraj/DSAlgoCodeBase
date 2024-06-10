package com.geek.java8.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamProcessing {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        IntStream.range(0, 10).forEach(arrayList1::add);
        System.out.println(arrayList1);

        // filter
        List<Integer> arrayList2 = arrayList1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(arrayList2);

        // map
        List<Integer> arrayList3 = arrayList1.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(arrayList3);

        // count
        long count = arrayList1.stream().filter(i -> i%2 == 0).count();
        System.out.println(count);

        List<Integer> arrayList4 = arrayList1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(arrayList4);
        arrayList4 = arrayList1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(arrayList4);
        arrayList4 = arrayList1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(arrayList4);
    }
}
