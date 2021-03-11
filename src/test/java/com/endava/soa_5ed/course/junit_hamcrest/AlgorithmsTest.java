package com.endava.soa_5ed.course.junit_hamcrest;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    @Test
    public void checkSimpleLowerCaseWordIsPalindromePrettyPlease() {
        String lowerCasePalindrome = "anna";
        boolean palindromeResult = Algorithms.isPalindrome(lowerCasePalindrome);
        // junit assert
        assertTrue(palindromeResult, "The lowercase word " + lowerCasePalindrome + " should be a palindrome.");
        // hamcrest assert
        assertThat("The lowercase word " + lowerCasePalindrome + " should be a palindrome.", palindromeResult, is(true));
    }

    @Test
    public void checkPalindromeWithDifferentCases() {
        String word = "Anna";
        boolean palindromeResult = Algorithms.isPalindrome(word);
        // junit assert
        assertTrue(palindromeResult, "The mixed case word " + word + " should be a palindrome.");
        // hamcrest assert
        assertThat("The mixed case word " + word + " should be a palindrome.", palindromeResult, is(true));
    }

    @Test
    public void checkPhraseIsPalindrome() {
        String phrasePalindrome = "Never odd or even";
        boolean palindromeResult = Algorithms.isPalindrome(phrasePalindrome);
        // junit assert
        assertTrue(palindromeResult, "The phrase '" + phrasePalindrome + "' should be a palindrome");
        // hamcrest assert
        assertThat("The phrase '" + phrasePalindrome + "' should be a palindrome", palindromeResult, is(true));
    }

    @Test
    public void checkComplexPhraseIsPalindrome() {
        String phrase = "Madam, I'm Adam";
        boolean result = Algorithms.isPalindrome(phrase);
        // junit assert
        assertTrue(result, "The phrase '" + phrase + "' should be a palindrome");
        // hamcrest assert
        assertThat("The phrase '" + phrase + "' should be a palindrome", result, is(true));
    }

    @Test
    public void checkComplexPhraseIsNotPalindrome() {
        String phrase = "I'm not a palindrome, please don't even try me";
        // junit assert
        assertFalse(Algorithms.isPalindrome(phrase), "The phrase '" + phrase + "' should not be a palindrome");
        // hamcrest assert
        assertThat("The phrase '" + phrase + "' should not be a palindrome", Algorithms.isPalindrome(phrase), is(false));
    }

    @Test
    public void someTest() {
        String a = "some String";
        String b = "some other String";
        assertThat(a, Matchers.not(b));
        assertThat(a, startsWith("some"));
        assertThat(a, Matchers.allOf(not(b), startsWith("some"), endsWith("ing")));
        assertThat(a, Matchers.anyOf(is(b), startsWith("some"), endsWith("String"), emptyString()));
    }
}
