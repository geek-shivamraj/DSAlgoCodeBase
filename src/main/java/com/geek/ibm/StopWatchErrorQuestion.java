package com.geek.ibm;

import java.util.Scanner;

public class StopWatchErrorQuestion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputTime = in.nextLine();
        while(!inputTime.isEmpty()) {
            System.out.println("InputTime " + inputTime); //HH:MM:SS
            predictTime(inputTime);
            inputTime = in.nextLine();
        }
    }

    private static void predictTime(String inputTime) {
        String input[] = inputTime.split(":");
        String hours = input[0]; String minutes = input[1]; String seconds = input[2];
        if(seconds.charAt(0) == '$' || minutes.charAt(0) == '$') {  //HH:MM:$S
            System.out.println("Min Value: " + inputTime.replace('$', '0'));
            System.out.println("Max Value: " + inputTime.replace('$', '5'));
        }
        if(seconds.charAt(1) == '$' || seconds.charAt(1) == '$') {
            System.out.println("Min value: " + inputTime.replace('$', '0'));
            System.out.println("Max value: " + inputTime.replace('$', '9'));
        }
        if(hours.charAt(0) == '$') {
            System.out.println("Min value: " + inputTime.replace('$', '0'));
            System.out.println("Max value: " + inputTime.replace('$', '2'));
        }
        if(hours.charAt(1) == '$') {
            if(hours.charAt(0) == '0' || hours.charAt(0) == '1') {
                System.out.println("Min value: " + inputTime.replace('$', '0'));
                System.out.println("Max value: " + inputTime.replace('$', '9'));
            }
            if(hours.charAt(0) == 2) {
                System.out.println("Min value: " + inputTime.replace('$', '0'));
                System.out.println("Max value: " + inputTime.replace('$', '3'));
            }
        }
    }
}
