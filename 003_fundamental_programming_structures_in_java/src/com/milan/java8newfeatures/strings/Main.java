package com.milan.java8newfeatures.strings;

public class Main {
    public static void main(String[] args) {
        String java = "Java\u2122";
        System.out.println(java);

        String greeting = "Hello";
        System.out.println(greeting.substring(0, 3));

        String all = String.join(";", "S", "M", "L", "XL");
        System.out.println(all);

        String test = "\uD835\uDD46 is the set of octonions.";
        int i;
        for (i = 0; i < test.length(); i++) {
            int cp = test.codePointAt(i);
            if (Character.isSupplementaryCodePoint(cp)) {
                i++;
            }
        }
        System.out.println(i);
        System.out.println(test.length());
    }
}
