package com.geek.algorithm;

// GCD - Greatest Common Divisor is same as HCF (Highest Common Factor)
// GCD of 2 integers which are non-zero, is the largest positive integer that
// divides each of the integers evenly.

// LCM - Least Common Multiple
public class C_GCD_HCF_LCM {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        System.out.println("a: " + a + ", b: " + b);
        //int gcd = gcdBruteForce(a, b);
        //int lcm = lcmBruteForce(a, b);
        int gcd = gcdEuclidAlgorithm(a, b); // Complexity- Time: O(log(min(a,b)))
        int lcm = (a * b) / gcd;    // Complexity- Time: O(log(min(a,b)))
        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }

    private static int lcmBruteForce(int a, int b) {
        int greater = Math.max(a, b);   // Complexity: Time: O(min(a, b))
        int smaller = Math.min(a, b);
        int i = greater;
        for(; i % smaller != 0; i += greater);
        return i;
    }

    private static int gcdBruteForce(int a, int b) {
        int gcd = 1;                    // Complexity: Time: O(min(a, b))
        for(int i = 2; i <= a && i <= b; i++) {
            if(a%i == 0 && b%i == 0)
                gcd = i;
        }
        return gcd;
    }

    private static int gcdEuclidAlgorithm(int a, int b) {
        return b == 0 ? a : gcdEuclidAlgorithm(b, a%b);
    }

    static long lcmOfArray(int N, int A[]){
        long lcm = 1L;
        for(int i = 0; i < N; i++)
            lcm = lcmProduct(lcm, A[i])%1000000007;
        return lcm;
    }

    private static long lcmProduct(long a,long b) {
        return a*b / gcdEuclidAlgo(a,b);
    }

    private static long gcdEuclidAlgo(long a, long b) {
        return b == 0 ? a : gcdEuclidAlgo(b, a%b);
    }
}
