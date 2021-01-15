package com.endava.soa_5ed.task1_basics;

public class Aggreg {
    public static void main(String[] args) {
        SecondsConverter secondsConverter = new SecondsConverter();
        int time = 50000;
        System.out.println("Converting " + time + " seconds: "
                + secondsConverter.convertToHours(time) + " hours, "
                + secondsConverter.convertToMinutes(time) + " minutes, "
                + secondsConverter.convertToSeconds(time) + " seconds.");

        DivisibleChecker divisibleChecker = new DivisibleChecker();
        divisibleChecker.checkDivisible(7);

        DayPrinter dayPrinter = new DayPrinter();
        dayPrinter.printDay(9);

        SumCalculator sumCalculator = new SumCalculator();
        System.out.println("The sum calculated using for loop: " + sumCalculator.sumForLoop(5));
        System.out.println("The sum calculated using while loop: " + sumCalculator.sumWhileLoop(5));
        System.out.println("The sum calculated using do while loop: " + sumCalculator.sumDoWhileLoop(5));
    }
}
