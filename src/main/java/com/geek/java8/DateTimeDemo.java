package com.geek.java8;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int date = scan.nextInt();
        int year = scan.nextInt();

        LocalDate localDate = LocalDate.of(year, month, date);
        String day = localDate.getDayOfWeek().toString();
        System.out.println(day);

    }
}
