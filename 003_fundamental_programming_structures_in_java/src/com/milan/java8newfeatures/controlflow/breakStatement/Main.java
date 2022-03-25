package com.milan.java8newfeatures.controlflow.breakStatement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        read_data:
        while(true) {
            for (int i = 10; i >= 0; i--) {
                System.out.println("Enter a number > 0:");
                n = in.nextInt();
                if (n < 0) {
                    break read_data;
                }
                System.out.println("Counter is: " + i);
            }
        }
        System.out.println("Out of the loops!");
    }
}
