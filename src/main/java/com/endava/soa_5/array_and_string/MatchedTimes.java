package com.endava.soa_5.array_and_string;

public class MatchedTimes {
    MatchedTimes() {
    }

    // this method multiply array values and return final result
    public static int multiplicationOfArray(int[] array) {
        int multiplication = 1;
        int index = 0;
        while (index < array.length) {
            multiplication *= array[index];
            index++;
        }
        return multiplication;
    }

    //this method check index of number in array
    public static int indexOfNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // this method return total matched times
    public static int totalMatchedTimes(int[] a, int number) {
        int matchedTimes = 0;
        for (int referenceNumber : a) {
            if (referenceNumber == number) {
                matchedTimes++;
            }
        }
        return matchedTimes;
    }

}
