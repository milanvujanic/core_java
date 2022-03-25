package com.milan.java8newfeatures.customClass;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee milan = new Employee("Milan Vujanic", 40000, 2000, 12, 18);
        Employee nemanja = new Employee("Nemanja Stupar", 60000, 2010, 10, 17);

        swap(milan, nemanja);

        System.out.println(milan.getName());
        System.out.println(nemanja.getName());

//        Employee[] staff = new Employee[3];
//        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
//        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
//        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
//
//        for (Employee e : staff) {
//            e.raiseSalary(5.0);
//        }
//
//        for (Employee e : staff) {
//            System.out.println("Id: " + e.getId() + ", name: " + e.getName() + ", salary: " + e.getSalary() + ", hireday: " + e.getHireDay());
//        }
//
//        int n = Employee.nextId;
//        System.out.println("Next available id is: " + n);

    }

    private static void swap(Employee e1, Employee e2) {
        Employee temp = e1;
        e1 = e2;
        e2 = temp;
    }

}

class Employee {

    public static int nextId = 1;

    private int id = assignId();
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    private static int assignId() {
        int i = nextId;
        nextId++;
        return i;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee that = (Employee) o;
        return this.name.equals(that.name);
    }
}
