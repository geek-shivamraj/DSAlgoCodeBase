package com.geek.java8.functionalInterface;

@FunctionalInterface
interface D_Interf {
    public void m1();
}

public class D_FITestDemo {
    int x = 777;
    public void m2() {
        int y = 222;
        D_Interf dInterf = ()-> {
            int x = 888;
            System.out.println("x: " + x);
            System.out.println("this.x: " + this.x);
            System.out.println("y: " + y);
//            y = 333;  // Compile Time Error
        };
        dInterf.m1();
    }

    public static void main(String[] args) {
        D_FITestDemo fi = new D_FITestDemo();
        fi.m2();
    }
}


