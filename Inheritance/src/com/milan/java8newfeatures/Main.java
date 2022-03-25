package com.milan.java8newfeatures;

import com.milan.java8newfeatures.abstractclasses.Employee;
import com.milan.java8newfeatures.abstractclasses.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person p = new Employee("Milan Vujanic", 2444.0);
        Class<?> clazz = p.getClass();
        System.out.println(clazz.getClass().getName());
    }
}
