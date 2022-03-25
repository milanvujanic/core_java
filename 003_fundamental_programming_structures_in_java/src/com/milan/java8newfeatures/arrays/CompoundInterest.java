package com.milan.java8newfeatures.arrays;

public class CompoundInterest {
    public static void main(String[] args) {

        int[][] nestedArray = new int[10][];
        for (int i = 0; i < nestedArray.length; i++) {
            nestedArray[i] = new int[i + 1];
        }

        for (int i = 0; i < nestedArray.length; i++) {
            for (int j = 0; j < nestedArray[i].length; j++) {
                int lotteryOdds = 1;
                for (int n = 1; n <= j; n++) {
                    lotteryOdds = lotteryOdds * (i - n + 1) / n;
                    nestedArray[i][j] = lotteryOdds;
                }
            }
        }

        for (int[] row : nestedArray) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }

//        final double STARTRATE = 10;
//        final int NRATES = 6;
//        final int NYEARS = 10;
//
//        double[] interestRate = new double[NRATES];
//        for (int j = 0; j < interestRate.length; j++) {
//            interestRate[j] = (STARTRATE + j) / 100.0;
//        }
//
//        double[][] balances = new double[NYEARS][NRATES];
//        for (int j = 0; j < balances[0].length; j++) {
//            balances[0][j] = 10000;
//        }
//
//        for (int i = 1; i < balances.length; i++) {
//            for (int j = 0; j < balances[i].length; j++) {
//                double interest = balances[i - 1][j] * interestRate[j];
//                balances[i][j] = balances[i - 1][j] + interest;
//            }
//        }
//
//        Arrays.stream(balances).flatMapToDouble(balance -> Arrays.stream(balance)).forEach(b -> System.out.print(b + ", "));
    }
}
