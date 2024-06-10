package com.geek.java8.streamAPI.processing.models;

import java.util.List;

public class Employee {
    private Long id;
    private String name;
    private Integer age;
    private String department;
    private List<Transaction> transactions;

    public Employee(Long id, String name, Integer age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(Long id, String name, List<Transaction> translist) {
        this.id = id;
        this.name = name;
        this.transactions = translist;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
