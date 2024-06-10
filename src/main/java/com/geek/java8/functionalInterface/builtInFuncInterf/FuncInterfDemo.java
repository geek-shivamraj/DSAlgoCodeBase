package com.geek.java8.functionalInterface.builtInFuncInterf;

@FunctionalInterface
interface Square {
    int calculate(int x);
}
public class FuncInterfDemo {
    public static void main(String[] args) {
        Square s = x -> x*x;
        int output = s.calculate(5);
        System.out.println(output);
    }
}
