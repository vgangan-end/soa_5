package com.endava.soa_5ed.task2.strings;

import java.util.ArrayList;

public class TypeOfClass {
    /* Strings - Exercises 1&2 */
    public void playWithTypes() {
        String text = "Hello, World";
        char exclMark = '!';
        char a = 'a';
        boolean isSmth = true;
        int intNumber = 3;
        double doubleNumber = 2.3;

        Object obj = new ArrayList<String>();
        System.out.println("The initial type of the object: " + obj.getClass());
        obj = a + a;
        System.out.println(obj);

        obj = isSmth + text;
        System.out.println("bool + String: " + obj.getClass());
        obj = a + exclMark;
        System.out.println("char + char: " + obj.getClass());
        obj = a + intNumber;
        System.out.println("char + int: " + obj.getClass());
        obj = exclMark + doubleNumber;
        System.out.println("char + double: " + obj.getClass());
        obj = a + text;
        System.out.println("char + String: " + obj.getClass());
        obj = intNumber + a;
        System.out.println("int + char: " + obj.getClass());
        obj = intNumber + intNumber;
        System.out.println("int + int: " + obj.getClass());
        obj = intNumber + doubleNumber;
        System.out.println("int + double: " + obj.getClass());
        obj = intNumber + text;
        System.out.println("int + String: " + obj.getClass());
        obj = doubleNumber + exclMark;
        System.out.println("double + char: " + obj.getClass());
        obj = doubleNumber + intNumber;
        System.out.println("double + int: " + obj.getClass());
        obj = doubleNumber + doubleNumber;
        System.out.println("double + double: " + obj.getClass());
        obj = doubleNumber + text;
        System.out.println("double + String: " + obj.getClass());
        obj = text + isSmth;
        System.out.println("String + bool: " + obj.getClass());
        obj = text + a;
        System.out.println("String + char: " + obj.getClass());
        obj = text + intNumber;
        System.out.println("String + int: " + obj.getClass());
        obj = text + doubleNumber;
        System.out.println("String + double: " + obj.getClass());
        obj = text + text;
        System.out.println("String + String: " + obj.getClass());
    }

}
