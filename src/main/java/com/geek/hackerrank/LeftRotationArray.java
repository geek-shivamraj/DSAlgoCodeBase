package com.geek.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftRotationArray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        System.out.println();
        int rotationCount = 2;
        System.out.println("Rotation count: " + rotationCount);

//        List<Integer> leftRotatedArr = leftRotation2(rotationCount, list);
//        System.out.print("Left Rotation by "+ rotationCount + ": ");
//        leftRotatedArr.forEach(i -> System.out.print(i + ", "));
//        System.out.println();

//        List<Integer> rightRotatedArr = rightRotate(3, list);
//        System.out.print("Right Rotation by 3: ");
//        rightRotatedArr.forEach(i -> System.out.print(i + ", "));
//        System.out.println();

        List<Integer> leftRotatedArr1 = leftRotation3(rotationCount, list);
        System.out.println("Left Rotation by "+ rotationCount + " using GCD Output: " + leftRotatedArr1);
    }

    private static List<Integer> leftRotation3(int rc, List<Integer> list) {
        int n = list.size();
        rc = rc%n;  // if rotationCount > n;
        if(rc == 0)
            return list;
        int maxItr = gcd(n, rc);
        System.out.println("Maxitr: " + maxItr);
        for(int itr = 0; itr < maxItr; itr++) {
            int temp = list.get(itr);
            int j = itr;
            int k = (j + rc)%n;
            while (j != k) {
                list.set(j, list.get(k));
                j = k;
                k = (k + rc) % n;
            }
            list.set(k, temp);
        }
        return list;
    }

    private static int gcd(int n, int rc) {
        return n == 0 ? rc: rc%n;
    }


    private static List<Integer> leftRotation2(int rotationCount, List<Integer> list) {

        List<Integer> left = list.subList(0, rotationCount);
        List<Integer> right = list.subList(rotationCount, list.size());
        list = Stream.concat(right.stream(), left.stream()).collect(Collectors.toList());
        return list;
    }

    private static List<Integer> rightRotate(int rotationCount, List<Integer> list) {

        List<Integer> left = list.subList(0, list.size()-rotationCount);
        List<Integer> right = list.subList(rotationCount-1, list.size());
        list = Stream.concat(right.stream(), left.stream()).collect(Collectors.toList());
        return list;
    }
    private static void leftRotation1(int rotationCount, List<Integer> list) {

        List<Integer> left = list.subList(0, rotationCount);
        List<Integer> right = list.subList(rotationCount, list.size());
        Collections.reverse(left);
        Collections.reverse(right);
        list = Stream.concat(left.stream(), right.stream()).collect(Collectors.toList());
        Collections.reverse(list);

    }
}
