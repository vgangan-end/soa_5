package com.endava.soa_5ed.task2.arrays;

public class MaxNumberIdentifier {
    /* Arrays - Exercise 3 */
    private int[] array;
    public MaxNumberIdentifier(int[] array){
        this.array = array;
    }
    public int getIndexOfMax() {
        return indexOfMax();
    }

    private int indexOfMax() {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }
}
