package com.geek.java8.streamAPI.processing;

import com.geek.java8.streamAPI.processing.models.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String[] args) {
        //sortWithoutStream(Arrays.asList(44, 33, 55, 99, 22, 66));
        //sortWithStream(Arrays.asList(44, 33, 55, 99, 22, 66));
        sortEmployeeById(Arrays.asList(new Employee(15L, "Shivam", 25, "d1"),
                new Employee(12L, "Raj", 21, "d1"),
                new Employee(18L, "Sam", 30, "d2"),
                new Employee(4L, "Joe", 12, "d2")));
    }

    private static void sortEmployeeById(List<Employee> list) {
        List<Employee> newList = list.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId())).collect(Collectors.toList());
        newList = list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
        newList = list.stream().sorted(Comparator.comparing(e -> e.getId())).collect(Collectors.toList());
        newList = list.stream().sorted(Comparator.comparingLong(Employee::getId)).collect(Collectors.toList());
        newList = list.stream().sorted(Comparator.comparingLong(e -> e.getId())).collect(Collectors.toList());
        System.out.println(newList);

        newList = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        newList = list.stream().sorted(Comparator.comparing(e -> e.getName())).collect(Collectors.toList());
        System.out.println(newList);

    }

    private static void sortWithStream(List<Integer> list) {
        List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
        newList = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        newList = list.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        newList = list.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        newList = list.stream().sorted(Integer::compare).collect(Collectors.toList());
        System.out.println(newList);

        newList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        newList = list.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(newList);

    }

    private static void sortWithoutStream(List<Integer> list1) {
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);

        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);

        // compare() method in Comparator functional interface
        // compareTo is Integer class instance method
        list1.sort((s1, s2) -> s1.compareTo(s2));
        list1.sort(Integer::compare);
        list1.sort(Integer::compareTo); // Internally uses compare(obj1, obj2)
        System.out.println(list1);

        list1.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);
    }
}
