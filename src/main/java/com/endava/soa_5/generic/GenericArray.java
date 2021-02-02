package com.endava.soa_5.generic;

public class GenericArray {
    public static <T> void printList(T[] list) {
        for (T value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
