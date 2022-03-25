package com.milan.java8newfeatures.controlflow.determinateloops;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option (1, 2, 3, 4) ");
        int choice = sc.nextInt();
        String testValue = "test";
        switch (testValue.toUpperCase(Locale.ROOT).length()) {
            case 1:
                System.out.println("You selected 1");
                break;
            case 2:
                System.out.println("You selected 2");
                break;
            case 3:
                System.out.println("You selected 3");
                break;
            case 4:
                System.out.println("You selected 4");
                break;
            default:
                System.out.println("Bad input!");
                break;
        }
    }
}
