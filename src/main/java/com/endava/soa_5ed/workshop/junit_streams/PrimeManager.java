package com.endava.soa_5ed.workshop.junit_streams;

import java.util.ArrayList;
import java.util.List;

public class PrimeManager {

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getAllPrimeNumbers(int limit) {
        List<Integer> result = new ArrayList<>();
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
