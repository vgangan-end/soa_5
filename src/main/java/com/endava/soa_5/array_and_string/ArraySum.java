package com.endava.soa_5.array_and_string;

public class ArraySum {
    ArraySum() {
    }

    //this method create array (lengthOfArray) length, and value equal with own indexes
    public static int[] createArrayWithValues(int lengthOfArray) {
        int[] temporaryArray = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            temporaryArray[i] = i + 1;
        }
        return temporaryArray;
    }

    // this method doubled array values
    public static void doublingValues(int[] doubledArrayValue) {
        for (int i = 0; i < doubledArrayValue.length; i++) {
            doubledArrayValue[i] *= 2;
        }
    }

    // calculate and return sum of array values
    public static int calculateSumOfArrayValues(int[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray;
    }

    public static void main(String[] args) {
        int[] array = createArrayWithValues(6);
        doublingValues(array);
        System.out.println(calculateSumOfArrayValues(array));
    }


}
