package com.endava.soa_5ed.task2.regex;

public class StringGenerator {
    /* Date Time and Regex - Exercise 1 */
    final String baseStr;
    int baseStrLen;

    public StringGenerator() {
        baseStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890,./;'[]\\<>?:\"{}|`~!@#$%^&*()_+-=";
        baseStrLen = baseStr.length();
    }

    public String generateString(int genStrLen) {
        StringBuilder builtString = new StringBuilder();
        for (int i = 0; i < genStrLen; i++) {
            builtString.append(baseStr.charAt((int) (Math.random() * (baseStrLen - 1))));
        }
        return builtString.toString();
    }

    public String removeNumChar(String genStr) {
        return genStr.replaceAll("[0-9]", "");
    }

    public String removeAlphaChar(String genStr) {
        return genStr.replaceAll("[a-z]|[A-Z]", "");
    }

    public String removeSymbols(String genStr) {
        return genStr.replaceAll("[/[^\\p{L}\\d\\s]u]", "");
    }


}
