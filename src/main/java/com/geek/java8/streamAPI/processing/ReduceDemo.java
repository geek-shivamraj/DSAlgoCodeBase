package com.geek.java8.streamAPI.processing;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Data
class Invoice{
    String invoiceNo;
    Double price;
    Double qty;

    public Invoice(String invoiceNo, Double price, Double qty) {
        this.invoiceNo = invoiceNo; this.price = price; this.qty = qty;
    }
}

public class ReduceDemo {
    public static void main(String[] args) {
//        basicReduceOperations();

        List<Invoice> invoices = Arrays.asList(new Invoice("A01", 9.99, 1.0),
                new Invoice("A02", 19.99, 1.5),
                new Invoice("A03", 4.99, 2.0));

        Double sum1 = invoices.stream().map(i -> i.getQty() * i.getPrice()).reduce(0.0, (i1, i2) -> i1 + i2);
        System.out.println(sum1);
    }

    private static void basicReduceOperations() {
        int[] nos = {1,2,3,4,5,6,7,8};
        int sum = IntStream.of(nos).sum();
        sum = IntStream.of(nos).reduce(0, (a, b) -> a + b);
        sum = IntStream.of(nos).reduce(0, Integer::sum);
        System.out.println(sum);

        int greatest = IntStream.of(nos).reduce(0, (a, b) -> a > b ? a : b);
        greatest = IntStream.of(nos).reduce(0, (a, b) -> Math.max(a, b));
        greatest = IntStream.of(nos).reduce(0, Math::max);
        System.out.println(greatest);

        String[] str = {"a", "b", "c", "d"};
        // If we won't use default/identity value, result would be wrapped with Optional<>
        Optional<String> constr = Stream.of(str).reduce((a, b) -> a + "|" + b);
        System.out.println(constr);
        String constr1 = Stream.of(str).reduce("", (a, b) -> a + "|" + b);
        System.out.println(constr1);
    }
}
