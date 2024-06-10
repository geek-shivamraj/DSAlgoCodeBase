package com.geek.java8.streamAPI.processing;

import com.geek.java8.streamAPI.processing.models.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SortGroupingDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1L, "shivam", 25, "ab"),
                new Employee(5L, "raj", 30,"cd"),
                new Employee(3L, "blink2", 55, "cd"),
                new Employee(4L, "Sam", 20, "ab"),
                new Employee(2L, "Zoe", 15, "ab"));

        // Variant 1: Here we're just providing Function to groupingBy,
        // by default Grouped elements will be stored in list,
        // by default the list is stored in the resultant Map
        Map<String, List<Employee>> groupedEmployee1 = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getId)
                        .thenComparing(Employee::getAge))
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedEmployee1.forEach((s1, list) -> System.out.println(s1 + ": " + list + ", "));
        System.out.println("***************************************************************");

        // Variant 2: Instead of storing Grouped elements in list,
        // we will store inside a Set in the resultant Map
        Map<String, Set<Employee>> groupedEmployee2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
        groupedEmployee2.forEach((s1, list) -> System.out.println(s1 + ": " + list + ", "));
        System.out.println("***************************************************************");

        // Variant 3: This time we will store the grouped elements in a Set &
        // tell the grouping collector to store the grouped employees in a TreeMap instance
        // instead of the default HashMap instance that was internally used in variant 1 & 2
        Map<String, Set<Employee>> groupedEmployee3 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.toSet()));
        groupedEmployee3.forEach((s1, list) -> System.out.println(s1 + ": " + list + ", "));

    }
}
