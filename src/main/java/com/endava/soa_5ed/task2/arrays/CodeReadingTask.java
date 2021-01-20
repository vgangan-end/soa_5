package com.endava.soa_5ed.task2.arrays;

public class CodeReadingTask {
    /* Arrays - Exercise 1 */
    public static int multiplyArrayNumbers(int[] array) {
        //this method multiplies all the numbers in an array and returns the product
        int product = 1;
        int i = 0;
        while (i < array.length) {
            product *= array[i];
            i++;
        }
        return product;
    }

    public static int checkEquality(int[] array, int numberToCheckAgainst) {
        //this method checks if the given number is present in the given array and returns it
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToCheckAgainst) {
                return array[i];
            }
        }
        return -1;
    }

    public static int countNumberMatches(int[] array, int numberToCheckAgainst) {
        //this method counts how many times is the given number present in the given array and returns the count
        int count = 0;
        for (int number : array) {
            if (number == numberToCheckAgainst) {
                count++;
            }
        }
        return count;
    }

    /*Exercise 2*/
    public static int[] createArray(int arrayLength) {
//    this method returns an int array with the given length and the values of all elements equal to 1

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void multiplyElementsWithTwo(int[] array) {
//    this method multiplies each element of the provided array with 2. it doesn't return anything
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static int sumArrayElements(int[] array) {
//    this method sums all the numbers in the given array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        System.out.println(i + " " + j);


        int[] array = createArray(5); // {1, 1, 1, 1, 1}
        multiplyElementsWithTwo(array); // {2, 2, 2, 2, 2}
        System.out.println("Sum Array Elements: " + sumArrayElements(array)); // 10

        System.out.println("Multiply array elements: " + multiplyArrayNumbers(new int[]{2, 3, 6, 12}));
        System.out.println("Check equality: " + checkEquality(new int[]{2, 3, 12, 8, 6}, 8));
        System.out.println("Count number matches: " + countNumberMatches(new int[]{1, 2, 3, 2, 4, 3}, 3));

        MaxNumberIdentifier indexOfMaxNum = new MaxNumberIdentifier(new int[]{1, 2, 3, 5, 2, 4});
        System.out.println("Index of max: " + indexOfMaxNum.getIndexOfMax());
    }
}
