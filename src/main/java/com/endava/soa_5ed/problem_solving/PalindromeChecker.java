package com.endava.soa_5ed.problem_solving;

public class PalindromeChecker {
    //Given a string of characters, determine if it is a palindrome or not
    boolean checkPalindrome(String word) {
        int start = 0;
        int end = word.length();
        boolean isEqual = false;
        for (int i = start; i < end / 2; i++) {
            if (word.charAt(i) == (word.charAt(end - 1 - i))) {
                isEqual = true;
            } else {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
}
