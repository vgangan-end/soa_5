package com.endava.soa_5ed.tasks.task1_basics;


public class DayPrinter {
    //    Write a method that prints day of the week by given number. Use switch case!

    String printDay(int number){
        String day;
        switch(number){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "";
                System.out.printf("The provided number - %d - is invalid\n", number);
                break;
        }
        return day;
    }
}
