package com.geek.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;




@FunctionalInterface
interface Square {
    int calculate(int i);

    default int squareCalculation(int i) {
        return i * i;
    }

    static void printCalculated(int i) {
        System.out.println(i);
    }
}

public class Demo implements Square {
    public static void main(String[] args) {

        Demo d = new Demo();
        System.out.println(d.calculate(2));
        System.out.println(d.squareCalculation(4));

//        List<Integer> list = new ArrayList<>();
//        IntStream.range(0, 2).forEach(i -> list.add(Integer.valueOf(args[i])));
//        for(int i = 0; i < args.length; i++) {
//            list.add(Integer.valueOf(args[i]));
//        }
//        int output = list.get(0) + list.get(1);
    }

    @Override
    public int calculate(int i) {
        return 0;
    }
}
