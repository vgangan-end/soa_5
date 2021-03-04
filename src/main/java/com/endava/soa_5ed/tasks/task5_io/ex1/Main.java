package com.endava.soa_5ed.tasks.task5_io.ex1;

import com.endava.soa_5ed.tasks.task1_basics.DivisibleChecker;
import com.endava.soa_5ed.tasks.task1_basics.SecondsConverter;
import com.endava.soa_5ed.tasks.task2.strings.ABCDChecker;

public class Main {

    public static void main(String[] args) {
        String path = "src/main/resources/testdata.properties";

        DivisibleChecker divCheck = new DivisibleChecker();
        SecondsConverter secondsConverter = new SecondsConverter();
        ABCDChecker abcdChecker = new ABCDChecker();
        PropertiesManager pm = new PropertiesManager(path);

        try {
            int num = Integer.parseInt(pm.getProperty(Keys.DIVNUMBER1.getKey()));
            divCheck.checkDivisible(num);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }
        try {
            int num = Integer.parseInt(pm.getProperty(Keys.DIVNUMBER2.getKey()));
            divCheck.checkDivisible(num);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }
        try {
            int num = Integer.parseInt(pm.getProperty(Keys.DIVNUMBER5.getKey()));
            divCheck.checkDivisible(num);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }

        try {
            secondsConverter.setTime(Integer.parseInt(pm.getProperty(Keys.SCNUMBER1.getKey())));
            System.out.println(secondsConverter);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }
        try {
            secondsConverter.setTime(Integer.parseInt(pm.getProperty(Keys.SCNUMBER4.getKey())));
            System.out.println(secondsConverter);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }

        try {
            abcdChecker.setWord(pm.getProperty(Keys.WORD1.getKey()));
            System.out.println(abcdChecker);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }
        try {
            abcdChecker.setWord(pm.getProperty(Keys.WORD2.getKey()));
            System.out.println(abcdChecker);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }
        try {
            abcdChecker.setWord(pm.getProperty(Keys.WORD4.getKey()));
            System.out.println(abcdChecker);
        } catch (NoValueException noValueException) {
            System.out.println(noValueException.getMessage());
        }
    }
}

