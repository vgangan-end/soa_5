package com.endava.soa_5ed.workshop.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PrimeManagerTest {

    @ParameterizedTest
    @ValueSource(ints = {11, 13, 17, 23})
    @DisplayName("Check that the number is prime")
        //comes with Junit 5
    void checkIsPrime(int number) {
        assertThat(String.format("Number %d is prime", number), PrimeManager.isPrime(number), is(true));

    }

    @ParameterizedTest
    @ValueSource(ints = {10, 12, 15, 18})
    @DisplayName("Check that the number is not prime")
    void checkIsNotPrime(int number) {
        assertThat(String.format("Number %d is prime", number), PrimeManager.isPrime(number), is(false));
    }

    @Test
    @DisplayName("Get all prime numbers")
    void getAllPrimeNumbers() {
        List<Integer> expectedResult = Arrays.asList(2, 3, 5, 7, 11, 13);
        assertThat("It should receive all prime numbers until 15", PrimeManager.getAllPrimeNumbers(15).size(), is(expectedResult.size()));
    }
}