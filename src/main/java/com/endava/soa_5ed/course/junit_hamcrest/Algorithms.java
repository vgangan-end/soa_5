package com.endava.soa_5ed.course.junit_hamcrest;

public class Algorithms {

    public static boolean isPalindrome(String potentialPalindrome) {
        String preparedString = potentialPalindrome.toLowerCase().replaceAll("\\W", "");
        char[] stringArray = preparedString.toCharArray();
        for (int i = 0; i <= stringArray.length / 2; i++) {
            if (stringArray[i] != stringArray[stringArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
