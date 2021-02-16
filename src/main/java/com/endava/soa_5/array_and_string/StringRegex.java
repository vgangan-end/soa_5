package com.endava.soa_5.array_and_string;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class StringRegex {
    public StringRegex() {
    }

    private StringBuilder randomString = new StringBuilder();
    private int stringLength;
    private String regex;
    private Pattern pattern;
    private Matcher matcher;

    public int getStringLength() {
        return stringLength;
    }

    public void setStringLength(int stringLength) {
        this.stringLength = stringLength;
    }

    public String randomStringGenerator() {

        for (int i = 0; i < getStringLength(); i++) {
            char c = (char) (ThreadLocalRandom.current().nextInt(33, 125));
            randomString.append(c);
        }
        return randomString.toString();

    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String matchedToRegexWord() {
        StringBuilder word = new StringBuilder();
        pattern = compile(getRegex());
        matcher = pattern.matcher(randomStringGenerator());
        System.out.println("Random string is: " + randomString.toString());
        while (matcher.find()) {
            word.append(matcher.group());

        }
        System.out.println("Random string after applied regex is: " + word.toString());
        return word.toString();
    }

}
