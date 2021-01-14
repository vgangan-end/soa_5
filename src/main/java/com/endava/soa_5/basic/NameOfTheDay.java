package com.endava.soa_5.basic;

public class NameOfTheDay {
    //Write a method that prints day of the week by given number.

    int day = 7;

    NameOfTheDay() {
    }

    NameOfTheDay(int day) {
        this.day = day;
    }

    String setDayForResult() {
        String message;
        switch (day) {
            case (1):
                message = day + "'st day is Monday";
                break;
            case (2):
                message = day + "'nd day is Tuesday";
                break;
            case (3):
                message = day + "'rd day is Wednesday";
                break;
            case (4):
                message = day + "'th day is Thursday";
                break;
            case (5):
                message = day + "'th day is Friday";
                break;
            case (6):
                message = day + "'th day is Saturday";
                break;
            case (7):
                message = day + "'th day is Sunday";
                break;
            default:
                message = day + " Is not a week day!";
        }
        return message;
    }
}
