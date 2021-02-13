package com.endava.soa_5ed.problem_solving;

public class ArraySorter {
    //Given an array of integers, implement the BubbleSort algorithm for sorting the elements of the array
    public static int[] bubbleSort(int[] array) {
        int container = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    array[j - 1] += array[j];
                    array[j] = array[j - 1] - array[j];
                    array[j - 1] = array[j - 1] - array[j];
                }
            }
        }
        return array;
    }
}
