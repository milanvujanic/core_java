package com.milan.java8newfeatures.primitivedatatypes;

public class Main {

    // \n id s newline
    public static void main(String[] args) {
        int a = 0b111100001110000;
        System.out.println(a);
        System.out.println("Fifth bit from the right is: " + ((a & 0b10000) / 0b10000));
        System.out.println("Fourth bit from the right is: " + (a & 1 << 3));
        int b = (a & 1 << 4) >> 4;
        System.out.println(b);
    }
}
