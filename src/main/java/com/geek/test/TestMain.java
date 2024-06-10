package com.geek.test;

import javax.swing.text.html.Option;
import java.util.*;

//Given a list of Person objects, where each Person has a list of Transaction objects,
// write a Java method to find the total sum of transactions for all persons under the age of 30.

public class TestMain {
    public static void main(String[] args) {
        List<Transaction> txn = Arrays.asList(new Transaction(10), new Transaction(20));
        List<Transaction> txn1 = Arrays.asList(new Transaction(30), new Transaction(40));
        List<Transaction> txn2 = Arrays.asList(new Transaction(50), new Transaction(20));

        List<Person> list = Arrays.asList(
                new Person("Ankit", 25, txn),
                new Person("Rahul", 21, txn1),
                new Person("Saurav", 32, txn2)
        );

        list.stream().filter(p -> p.getAge() < 30).flatMap(person -> person.getTransactions().stream())
                .mapToInt(Transaction::getAmount).sum();
    }

    static int except()

    {
        try
        {

            int a = 10%0;

            return 1;

        }

        catch(Exception e)

        {
            return 2;

        }

        finally {

            return 3;

        }

    }
}
