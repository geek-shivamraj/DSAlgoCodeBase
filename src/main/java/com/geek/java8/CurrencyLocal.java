package com.geek.java8;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyLocal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        System.out.println("US: " + currency(Locale.US, payment) );
        System.out.println("India: " + currency(new Locale("en","IN"), payment));
        System.out.println("China: " + currency(Locale.CHINA, payment));
        System.out.println("France: " + currency(Locale.FRANCE, payment));
    }

    public static String currency(Locale locale, Double payment){
        return NumberFormat.getCurrencyInstance(locale).format(payment);
//        NumberFormat nFormat = NumberFormat.getCurrencyInstance(locale);
//        if (locale.equals(new Locale("en", "IN"))) {
//            return "Rs." + nFormat.format(payment).substring(1); // Skip the currency symbol
//        } else {
//            return nFormat.format(payment);
//        }
    }
}
