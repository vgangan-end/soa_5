package com.endava.soa_5ed.tasks.task2.strings;


import com.endava.soa_5ed.tasks.task2.datetime.DateTimeFormatterClass;
import com.endava.soa_5ed.tasks.task2.regex.StringGenerator;

public class Test {
    public static void main(String[] args) {
        ABCDChecker checker = new ABCDChecker("abcdee");
        System.out.println("Is the word '" + checker.getWord() + "' Abecedarian? " + checker.isAbecedarian());

        StringGenerator strGen = new StringGenerator();
        String testStr = strGen.generateString(9);
        System.out.format("Generated string: %s\n", testStr);
        System.out.format("String with removed numeric characters: %s\n", strGen.removeNumChar(testStr));
        System.out.format("String with removed alphabetic characters: %s\n", strGen.removeAlphaChar(testStr));
        System.out.format("String with removed symbols: %s\n", strGen.removeSymbols(testStr));

        DateTimeFormatterClass formatterObj = new DateTimeFormatterClass();
        System.out.println("Current date and time in first format is " + formatterObj.getFormattedDateTime(formatterObj.getFormat("dd-MM-yyyy hh:mm:ss")));
        System.out.println("Current date and time in second format is " + formatterObj.getFormattedDateTime(formatterObj.getFormat("LLL/dd/yyyy hh:mm")));

        DateTimeFormatterClass dayOfWeekObj = new DateTimeFormatterClass("dd-LLL-yyyy");
        System.out.println("Signing of the declaration of independence of the USA was on " + dayOfWeekObj.getDayOfWeek("02-Aug-1776"));
        System.out.println("Signing the declaration of independence of Moldova was on " + dayOfWeekObj.getDayOfWeek("27-Aug-1991"));
        System.out.println("Forrest Gump was released on " + dayOfWeekObj.getDayOfWeek("23-Jun-1994"));

        System.out.println();
        System.out.println("-----Checking type of result after adding/concatenating-----");

        TypeOfClass typeOf = new TypeOfClass();
        typeOf.playWithTypes();
    }
}

