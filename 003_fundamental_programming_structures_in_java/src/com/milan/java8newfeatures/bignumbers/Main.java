package com.milan.java8newfeatures.bignumbers;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(10);
        System.out.println(a.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(3)));
    }
}
