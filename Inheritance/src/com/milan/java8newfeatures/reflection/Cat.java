package com.milan.java8newfeatures.reflection;

public class Cat extends Animal {

    private static void something() {
        System.out.println("Cat: something()");
    }

    @Override
    public void makeSound() {
        meow();
    }

    private void meow() {
        System.out.println("The cat is meowing");
    }
}
