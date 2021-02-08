package com.endava.soa_5.array_and_string;

public class MaxIndexOfArray {
    public MaxIndexOfArray() {
    }

    private int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public int indexOfMax() {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
