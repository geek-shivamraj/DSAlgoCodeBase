package com.geek.test;

import java.util.List;

public class Person {
    String name;
    int age;
    List<Transaction> transactions;
    public Person (String name, int age, List<Transaction> transactions) {
        this.name = name;
        this.age = age;
        this.transactions = transactions;

    }

    public String getName () {



        return name;

    }



    public void setName (String name) {



        this.name = name;

    }



    public int getAge () {



        return age;

    }



    public void setAge (int age) {



        this.age = age;

    }



    public List<Transaction> getTransactions () {



        return transactions;

    }



    public void setTransactions (List<Transaction> transactions) {



        this.transactions = transactions;

    }
}
