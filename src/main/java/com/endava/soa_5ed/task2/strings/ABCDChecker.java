package com.endava.soa_5ed.task2.strings;

public class ABCDChecker {
    /* Strings - Exercise 2 */
    String word;

    public ABCDChecker() {
    }

    public ABCDChecker(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public boolean isAbecedarian() {
        int length = word.length();
        for (int i = 0; i < length - 1; i++) {
            if (word.charAt(i) >= word.charAt(i + 1))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (isAbecedarian()) {
            return "The word '" + word + "' is abecedarian";
        } else
            return "The word '" + word + "' is not abecedarian";
    }
}
