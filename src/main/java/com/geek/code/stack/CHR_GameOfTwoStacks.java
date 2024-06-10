package com.geek.code.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CHR_GameOfTwoStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int maxSum = Integer.parseInt(firstMultipleInput[2]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                int result = twoStacks2(maxSum, a, b);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
//    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>(List.of(4, 2, 4, 6, 1));
//        List<Integer> b = new ArrayList<>(List.of(2, 1, 8, 5));
//        int maxSum = 10;
//        int n = twoStack(maxSum, a, b);
//        System.out.println(n);
//    }

    private static int twoStacks2(int maxSum, List<Integer> a, List<Integer> b) {
        int count = 0;
        int countA = 0, countB = 0, sum = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) + sum <= maxSum) {
                sum += a.get(i);
                countA++;
            } else
                break;
        }
        count = countA;
        for(int j = 0; j < b.size(); j++) {
            sum += b.get(j);
            countB++;
            while(sum > maxSum && countA > 0) {
                sum -= a.get(countA - 1);
                countA--;
            }
            count = (sum <= maxSum) ? Math.max((countA + countB), count) : count;
        }
        return count;
    }

    private static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int mySum = 0;
        int removeCount = 0;
        int index = 0;
        while(index < a.size()) {
            if(a.get(index) + mySum <= maxSum) {
                mySum += a.get(index);
                index++;
            }else
                break;
        }
        mySum = 0;
        while(a.size() > 0 && b.size() > 0) {
            if(a.get(0) <= b.get(0) && a.get(0) + mySum <= maxSum) {
                mySum += a.get(0); a.remove(0); removeCount++;
            } else if(b.get(0) <= a.get(0) && b.get(0) + mySum <= maxSum) {
                mySum += b.get(0); b.remove(0); removeCount++;
            } else {
                break;
            }
        }
        while(a.size() > 0) {
            if(a.get(0) + mySum <= maxSum) {
                mySum += a.get(0); a.remove(0); removeCount++;
            }else
                break;
        }
        while(b.size() > 0) {
            if(b.get(0) + mySum <= maxSum) {
                mySum += b.get(0); b.remove(0); removeCount++;
            }else
                break;
        }
        return Math.max(removeCount, index);
    }

    private static int twoStacks1(int maxSum, List<Integer> a, List<Integer> b) {
        int mySum = 0;
        int removeCount = 0;
        int index = 0;
        while(index < a.size()) {
            if(a.get(index) + mySum <= maxSum) {
                mySum += a.get(index);
                index++;
            }else
                break;
        }
        if(mySum > maxSum) {
            index -= 1;
            removeCount = Math.max(removeCount, index);
        } else {
            removeCount = Math.max(removeCount, index);
            index -= 1;
        }

        int j = 0;
        while(j < b.size() && mySum <= maxSum) {
            mySum += b.get(j);
            j++;
            while(mySum > maxSum && index >= 0) {
                mySum -= a.get(index);
                index--;
            }
            if(mySum <= maxSum)
                removeCount = Math.max(removeCount, index + j + 1);
        }

        return removeCount;
    }
}
