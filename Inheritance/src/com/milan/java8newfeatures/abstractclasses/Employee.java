package com.milan.java8newfeatures.abstractclasses;

public class Employee extends Person {

    private double bonus;

    public Employee(String name, double salary) {
        super(name, salary);
        bonus = 0.0;
    }

    public double getBonus() {
        return this.bonus;
    }

    @Override
    public String description() {
        return "Employee";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Employee that = (Employee) o;
        return this.getBonus() == that.getBonus();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * Double.hashCode(bonus);
    }
}
