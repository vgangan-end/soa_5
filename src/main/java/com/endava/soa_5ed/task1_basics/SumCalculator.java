package com.endava.soa_5ed.task1_basics;

import java.util.Scanner;

public class SumCalculator {
//    Write 3 methods that calculates sum of numbers from 0 to a given number.
//            (1) Use for loop
//            (2) Use while loop
//            (3) Use do while loop

    int sumForLoop(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    int sumWhileLoop(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i++;
        }
        return sum;
    }

    int sumDoWhileLoop(int num) {
        int sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
        } while (i <= num);
        return sum;
    }
}
