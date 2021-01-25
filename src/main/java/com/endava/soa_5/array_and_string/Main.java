package com.endava.soa_5.array_and_string;

public class Main {
    public static void main(String[] args) {
        Abecedarian abecedarian = new Abecedarian("assszs");
        System.out.println(abecedarian.proveIsAbecedarian());

        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter();
        dateTimeFormatter.setTimeFormat("MMM/dd/yyyy HH:mm:ss");
        dateTimeFormatter.transformDateFormat();
        System.out.println("New date format " + dateTimeFormatter.transformDateFormat());
        DateTimeFormatter dateTimeFormatter2 = new DateTimeFormatter();
        dateTimeFormatter2.setTimeFormat("dd-MM-yyyy HH:mm:ss");
        dateTimeFormatter2.transformDateFormat();
        System.out.println("New date format " + dateTimeFormatter2.transformDateFormat());
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        dayOfWeeks.setYear(2021);
        dayOfWeeks.setMonth(7);
        dayOfWeeks.setDay(4);
        dayOfWeeks.setDateAndShowDayOfWeek();

        MaxIndexOfArray maxIndexOfArray = new MaxIndexOfArray();
        maxIndexOfArray.setArray(new int[]{4, 9, 8, 71, 4, 5});
        System.out.println( maxIndexOfArray.indexOfMax());
        StringRegex stringRegex = new StringRegex();
        stringRegex.setStringLength(16);
        stringRegex.setRegex("\\D");
        stringRegex.matchedToRegexWord();
        stringRegex.setRegex("[^a-zA-Z]");
        stringRegex.matchedToRegexWord();
        stringRegex.setRegex("\\w");
        stringRegex.matchedToRegexWord();

    }

}
