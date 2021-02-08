package com.endava.soa_5.exception_and_io;

import com.endava.soa_5.array_and_string.Abecedarian;
import com.endava.soa_5.array_and_string.MaxIndexOfArray;

public class Main {

    static SetProperty properties;

    public static void main(String[] args) {
        properties = new SetProperty("Resource.properties");

        try {
            // This part of code will get value from properties file and will return boolean value if String is abecedarian or not.
            System.out.println("This message is: " + new Abecedarian(getPropertyValue("word")).proveIsAbecedarian());
            System.out.println("This message is: " + new Abecedarian(getPropertyValue("word1")).proveIsAbecedarian());
            System.out.println("This message is: " + new Abecedarian(getPropertyValue("wordNull")).proveIsAbecedarian());

            // This part of code will get value from properties file and will return index of max number
            MaxIndexOfArray maxIndexOfArray = new MaxIndexOfArray();
            maxIndexOfArray.setArray(convertValuesFromPropertiesFileInIntArray("array"));
            System.out.println("Maximal value of arrayInString has index: " + maxIndexOfArray.indexOfMax());

        } catch (NullPointerException exception) {
            new CustomExceptions("Yor parameter is null. Please check your *.properties file.");
        }

        // This part of code will convert fileContent of input file into output Content using regex.
        FileConverter fileConverter = new FileConverter("tetsFile.txt");
        fileConverter.setOutputFileName("newOutputFileNames");
        fileConverter.putValuesIntoOutputFileUsingRegex("\\w{9}");
    }

    public static String getPropertyValue(String keyWord) {
        String value = "";
        try {
            value = properties.getPropValues(keyWord);
        } catch (NullPointerException exception) {
            new CustomExceptions("Yor parameter is null. Please check your properties file.");
        }
        return value;
    }

    public static int[] convertValuesFromPropertiesFileInIntArray(String keyWord) {
        String arrayInString = getPropertyValue(keyWord);
        String[] temporalArray = arrayInString.split(",");
        int[] newArray = new int[temporalArray.length];
        try {
            for (int i = 0; i < temporalArray.length; i++) {
                newArray[i] = Integer.parseInt(temporalArray[i]);
            }
        } catch (NumberFormatException e) {
            new CustomExceptions("Yor parameter is not a NUMBER. Please check your *.properties file.");
        }
        return newArray;
    }
}