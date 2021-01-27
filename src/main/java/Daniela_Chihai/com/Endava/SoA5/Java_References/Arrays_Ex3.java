package Daniela_Chihai.com.Endava.SoA5.Java_References;

public class Arrays_Ex3 {
    public static int indexOfMax(int[] array) {
        int maxOfElements = array[0];
        int indexOfMaxNumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxOfElements) {
                maxOfElements = array[i];
                indexOfMaxNumber = i;
            }
        }
        return indexOfMaxNumber;
    }
}


