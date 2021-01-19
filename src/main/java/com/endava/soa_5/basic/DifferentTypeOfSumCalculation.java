package com.endava.soa_5.basic;

public class DifferentTypeOfSumCalculation {
    //Write 3 methods that calculates sum of numbers from 0 to a given number

    int number = 0;

    DifferentTypeOfSumCalculation() {
    }

    DifferentTypeOfSumCalculation(int number) {
        this.number = number;
    }

    int sumForLoopResult() {
        int result = 0;
        for (; number > 0; number--) {
            result += number;
        }
        return result;
    }

    int sumWhileResult() {
        int result = 0;
        while (number > 0) {
            result += number;
            number--;
        }
        return result;
    }

    int sumDoWhileResult() {
        int result = 0;
        do {
            result += number;
            number--;
        } while (number - 1 > 0);
        return result;
    }
}
