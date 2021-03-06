package com.milan.java8newfeatures.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How much money will you contribute every year?");
        double amount = in.nextDouble();

        System.out.println("Interest rate in '%':");
        double interestRate = in.nextDouble();

        double balance = 0;
        int yearCount = 0;

        String input;

        do {
            balance += amount;
            double interest = balance * interestRate / 100.0;
            balance += interest;

            yearCount++;

            System.out.printf("After %1$d years you will have %2$,.3f dollars on your account%n", yearCount, balance);

            System.out.println("Do you want to retire (Y/N)?");
            input = in.next();
        } while (input.equalsIgnoreCase("N"));


//        Scanner in = new Scanner(System.in);
//
//        System.out.println("How much money do you need to retire?");
//        double goal = in.nextDouble();
//
//        System.out.println("How much money will you contribute every year?");
//        double payment = in.nextDouble();
//
//        System.out.println("Interest rate in '%':");
//        double interestRate = in.nextDouble();
//
//        double balance = 0;
//        int years = 0;
//
//        while (balance < goal) {
//            balance += payment;
//            double interest = balance * interestRate / 100;
//            balance += interest;
//            years++;
//        }
//
//        System.out.println("You can retire in " + years + " years.");
    }
}
