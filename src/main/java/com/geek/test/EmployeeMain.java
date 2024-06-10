package com.geek.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// Employee - id, department, name
// Sort the employee by id group by department

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "shivam", "ab"),
                new Employee(5, "raj", "cd"),
                new Employee(3, "blink2", "cd"),
        new Employee(4, "Sam", "ab"),
        new Employee(2, "Zoe", "ab"));
        Map<String, List<Employee>> groupedEmployee = employeeList.stream().sorted(Comparator.comparing(Employee::getId))
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedEmployee.forEach((s1, list) -> System.out.println(s1 + ": " + list + ", "));
        employeeList.stream().collect(Collectors.toMap(Employee::getId, Employee::getDepartment));

    }
}
