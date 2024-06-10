package com.geek.java8.streamAPI.processing;

import com.geek.java8.streamAPI.processing.models.Employee;
import com.geek.java8.streamAPI.processing.models.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        basicFlattening();

        List<Transaction> tran1 = Arrays.asList(new Transaction(24), new Transaction(48));
        List<Transaction> tran2 = Arrays.asList(new Transaction(37), new Transaction(55));
        List<Employee> employeeList = Arrays.asList(new Employee(1L, "Sam", tran1),
                new Employee(2L, "Will", tran2));
        // Fetch sum of transactions for all employee
        int sum = employeeList.stream().flatMap(e -> e.getTransactions().stream()).mapToInt(Transaction::getAmount).sum();
        System.out.println("Sum of all Transactions: " + sum);
    }

    private static void basicFlattening() {
        List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
        List<List<Integer>> listOfList = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);
        System.out.println("Before Flatting List: " + listOfList);
        List<Integer> flattenList = listOfList.stream().flatMap(list -> list.stream()).toList();
        System.out.println("After Flatting List: " + flattenList);

        List<String> list1 = Arrays.asList("Geeks", "GFG", "Shivam", "Raj");
        System.out.print("Flatten String: ");
        list1.stream().flatMap(s -> Stream.of(s.charAt(1))).forEach(s -> System.out.print(s + ", "));
        System.out.println();

        long[] arr1 = {1, 2, 3, 4, 5};
        LongStream longStream1 = LongStream.of(arr1);
        LongStream longStream = Stream.of(arr1).flatMapToLong(Arrays::stream);
        longStream.forEach(x -> System.out.print(x + ", "));
        System.out.println();

        long[][] arrr1 = new long[][]{{1,2}, {4,5}, {6, 7}};
        System.out.print("Long[][] flattens: ");
        //Stream.of(arrr1).flatMapToLong(arr -> LongStream.of(arr)).forEach(x -> System.out.print(x + ", "));
        Stream.of(arrr1).flatMapToLong(LongStream::of).forEach(x -> System.out.print(x + ", "));
        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        IntStream intStream = Stream.of(arr2).flatMapToInt(Arrays::stream);
        intStream.forEach(x -> System.out.print(x + ", "));
        System.out.println();
    }
}
