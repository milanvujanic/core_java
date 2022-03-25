package com.milan.java8newfeatures.abstractclasses;

import java.util.Objects;

public abstract class Person {

    private String name;
    private double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract String description();

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Person)) {
            return false;
        }
        Person that = (Person) o;
        return this.getName().equals(that.getName()) && this.getSalary() == that.getSalary();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + Double.hashCode(salary);
    }
}
