package com.endava.soa_5.array_and_string;

public class Abecedarian {

    private String word;

    public Abecedarian() {
    }

    public Abecedarian(String word) {
        this.word = word;
    }

    public boolean proveIsAbecedarian() {

        boolean isAbecedarian = true;
        char[] stringArray = new char[word.length()];
        if (word.equals("") || word == null) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            stringArray[i] = word.toUpperCase().charAt(i);
        }

        for (int i = 0; i < stringArray.length - 1; i++) {

            if (stringArray[i] > stringArray[i + 1]) {
                isAbecedarian = false;

            }
        }
        return isAbecedarian;
    }
}
