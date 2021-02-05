package Daniela_Chihai.com.Endava.SoA5.Java_References;

public class Arrays_Ex2 {
    public static int[] createArray(int lengthOfArray) {
        int[] a = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            a[i] = i + 1;
        }
        return a;
    }
    // This method returns the values of all elements of an array, based on its length starting with 1

    public static void multiplyElementsOfArrayWithTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2; //jub[i] = jub[i]*2
        }
    }
    // This method multiplies each element of tha array with the value of "2". It does not return anything

    public static int sumOfAllArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; //fus=fus+array[i]
        }
        return sum;
    }
    // This method adds to the sum variable each element of the array. It returns the sum of all of the array element summed up

}
