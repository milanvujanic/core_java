package com.milan.java8newfeatures.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        animalSound(new Dog());
    }

    private static <T extends Animal> void animalSound(T t) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = t.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.contains("static")) {
                m.setAccessible(true);
                m.invoke(null);
                break;
            }
        }
    }
}
