package com.geek.hackerrank;

public class GcdOrHcf {

    public static void main(String[] args){
        int a = 0, b = 42; // GCD/HCF = 4
        int gcd = findGCDRecursive(a, b);
        System.out.println("GCD of " + a + " & " + b + ": " + gcd);

    }

    private static int findGCD(int a, int b) {      // TimeComplexity: O(log(min(a,b))
        if(a == 0 || b == 0)
            return 0;
        if(a == b)
            return a;
        int divident = Math.max(a, b);
        int divisor = Math.min(a, b);
        int mod = divident % divisor;
        while(mod != 0) {
            divident = divisor;
            divisor = mod;
            mod = divident % divisor;
        }
        return divisor;
    }

    private static int findGCDRecursive(int a, int b) { // TimeComplexity: O(log(min(a,b))
//        if(b == 0)
//            return a;
//        return findGCDRecursive(b, a%b);

        return b == 0 ? a : findGCDRecursive(b, a%b);
    }
}
