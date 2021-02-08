package Daniela_Chihai.com.Endava.SoA5.Java_References;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

// Arrays_Ex2
        int[] array = Arrays_Ex2.createArray(5); // assigns the array created in the method createArray and attributes its length (5)/ {1,2,3,4,5}
        Arrays_Ex2.multiplyElementsOfArrayWithTwo(array); // all of the elements from the array are multiplied with 2/ {2,4,6,8,10}
        System.out.println(Arrays_Ex2.sumOfAllArrayElements(array)); // prints the sum of all the elements of the array/ {2+4+6+8+10}=30

// Arrays_Ex3
        int[] arrays = {100, 20, 16, 66};
        System.out.println("The index of the largest element is " + Arrays_Ex3.indexOfMax(arrays));

//        Regex_Ex1
        System.out.println(DateTimeRegexEx1.generateRandomString());
        String Str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,./;'[]\\<>?:\"{}|`~!@#$%^&*()_+-=";
        System.out.println(DateTimeRegexEx1.removeAlphabeticalCharacters(Str));
        System.out.println(DateTimeRegexEx1.removeNumericalCharacters(Str));
        System.out.println(DateTimeRegexEx1.removeSymbolsCharacters(Str));

//Regex_Ex3
        //- 1. Signing the declaration of independence of the USA
        Date date = new Date(-124, 7, 2);
        System.out.println(DateTimeRegexEx3.getDayOfTheWeek(date));
        // -2. Signing the declaration of independence of Moldova
        //Date date = new Date(91, 7, 27);
        System.out.println(DateTimeRegexEx3.getDayOfTheWeek(date));
        //  -3. Your favorite movie was released.
        //Date date = new Date(54, 8, 3);
        System.out.println(DateTimeRegexEx3.getDayOfTheWeek(date));
    }
}
