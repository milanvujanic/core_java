package com.milan.java8newfeatures.inputoutput;

import com.oracle.webservices.internal.api.databinding.Databinding;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        double x = -10000.0 / 3.0;
        System.out.printf("%(,.2f", x);
        System.out.println();

        System.out.printf("%tc", new Date());
        System.out.printf("%1$s %2$tY %<tm, %<tA", "Due date:", new Date());

        PrintWriter writer = new PrintWriter("myfile.txt", "UTF-8");
        writer.append("This is a new line.");
        writer.close();

        Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
        String line = in.nextLine();
        System.out.println(line);
        in.close();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = sc.next();
//
//        System.out.println("What is your age?");
//        int age = sc.nextInt();
//        System.out.println(age);
    }
}
