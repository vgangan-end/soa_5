package com.endava.soa_5.basic;

public class Number {
    //Write a method that prints if a number is divisible by 3 or 5.

    int number = 1;

    Number() {
    }

    Number(int number) {
        this.number = number;
    }

    String setNumberForResult() {
        String message;
        if (number % 3 == 0 && number % 5 == 0) {
            message = number + " \"Is divisible by 3 and 5\"";

        } else if (number % 3 == 0) {
            message = number + " \"Is divisible by 3\"";

        } else if (number % 5 == 0) {
            message = number + " \"Is divisible by 5\"";

        } else {
            message = number + " \"Isn't divisible by 3 and 5\"";
        }
        return message;
    }

}
