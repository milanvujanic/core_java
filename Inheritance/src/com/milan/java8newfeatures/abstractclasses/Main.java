package com.milan.java8newfeatures.abstractclasses;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Person p = new Employee("Milan Vujanic", 2444.0);
        Class<?> clazz = p.getClass();
        Method m = clazz.getMethod("description");
        m.invoke(clazz);
    }
}
