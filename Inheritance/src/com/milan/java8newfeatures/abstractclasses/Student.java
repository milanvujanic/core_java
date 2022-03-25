package com.milan.java8newfeatures.abstractclasses;

public class Student extends Person {

    private String major;

    public Student(String name, String major) {
        super(name, 0.0);
        this.major = major;
    }

    @Override
    String description() {
        return "Student";
    }
}
