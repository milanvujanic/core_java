package com.milan.java8newfeatures.reflection;

public class Dog extends Animal {

    public void nothing() {}

    private static void something() {
        System.out.println("Dog: something()");
    }

    @Override
    public void makeSound() {
        bark();
    }

    private void bark() {
        System.out.println("The dog is barking");
    }
}
