package com.milan.java8newfeatures;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        printMonthCalendar(0);
    }

    private static void printMonthCalendar(int daysOffset) {
        LocalDate ld = LocalDate.now();
        LocalDate modifiedDate = ld.plusDays(daysOffset);

        int dayOfMonth = modifiedDate.getDayOfMonth();
        LocalDate beginningOfMonth = modifiedDate.minusDays(dayOfMonth - 1);
        int firstDayOfMonth = beginningOfMonth.getDayOfWeek().getValue();
        int month = modifiedDate.getMonthValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun\n");

        for (int i = 1; i < firstDayOfMonth; i++) {
            System.out.printf("%4s", " ");
        }

        while (beginningOfMonth.getMonthValue() == month) {
            System.out.printf("%3d", beginningOfMonth.getDayOfMonth());
            if (beginningOfMonth.getDayOfMonth() == dayOfMonth) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            beginningOfMonth = beginningOfMonth.plusDays(1);
            if (beginningOfMonth.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (beginningOfMonth.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }

//    private static void printMonthCalendar(int daysOffset) {
//        LocalDate ld = LocalDate.now();
//        LocalDate modifiedDate = ld.plusDays(daysOffset);
//
//        int dayOfMonth = modifiedDate.getDayOfMonth();
//        LocalDate beginningOfMonth = modifiedDate.minusDays(dayOfMonth - 1);
//        int firstDayOfMonth = beginningOfMonth.getDayOfWeek().getValue();
//        int lengthOfMonth = modifiedDate.lengthOfMonth();
//
//        System.out.println("Mon Tue Wed Thu Fri Sat Sun\n");
//
//        for (int i = 1; i <= lengthOfMonth; i++) {
//            if (i == 1) {
//                int offset = 3 + (firstDayOfMonth - 1) * 4;
//                System.out.printf("%" + offset + "d", i);
//            } else if (((firstDayOfMonth + i - 1) - 1) % 7 == 0) {
//                System.out.printf("%3d", i);
//            } else if (i == dayOfMonth + 1) {
//                System.out.printf("%3d", i);
//            } else {
//                System.out.printf("%4d", i);
//            }
//            if (i == dayOfMonth) {
//                System.out.print("*");
//            }
//            if ((firstDayOfMonth + i - 1) % 7 == 0) {
//                System.out.println();
//            }
//        }
//    }
}
