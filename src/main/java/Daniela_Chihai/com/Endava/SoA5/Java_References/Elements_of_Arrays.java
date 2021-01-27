package Daniela_Chihai.com.Endava.SoA5.Java_References;

public class Elements_of_Arrays {
    public static int numbersMultiplication(int[] array) {      //banana is the method; int[] a{3,8,9} - array of parameters
        int product = 1; // initializing the first value of the product
        int i = 0;   // initialization of i with 0
        while (i < array.length) {  // while i { from 0....to length of a}
            product = product * array[i];  // multiplying each element of the array with the next one
            i++;   // it increments the array with the next value
        }
        return product;
    }
    // This method calculates the product of multiplication of each element from the array of numbers between them.

    public static int getIndex(int[] array, int num) { // "int num" is an external variable. We should declare it in the main method when running program
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) { // if the value of the array element equals the value given to the "num" variable
                return i; // the program will return the index of that value from the array
            }
        }
        return -1; // else it will return an error
    }
    // This method returns the index of the array element, that equals the value of "num" variable

    public static int countNumberInArray(int[] array, int num) {
        int counter = 0;
        for (int element : array) { // a[i]=element
            if (element == num) {
                counter++;
            }
        }
        return counter;
    }
}
// This method calculates how many times can you find a number in our array of numbers