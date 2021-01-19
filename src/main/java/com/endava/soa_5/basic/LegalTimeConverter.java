package com.endava.soa_5.basic;

public class LegalTimeConverter {
    //Write a method that converts a total number of seconds to hours, minutes, and seconds.

    int totalSec, sec, min, hour;

    LegalTimeConverter() {
    }

    LegalTimeConverter(int totalSec) {
        this.totalSec = totalSec;
    }

    int calculateSec() {
        sec = totalSec % 60;
        return sec;
    }

    int calculateMin() {
        min = (totalSec % 3600) / 60;
        return min;
    }

    int calculateHour() {
        hour = totalSec / 3600;
        return hour;
    }

    String messageForResult() {
        String result = totalSec + " seconds = " + calculateHour() + " hours, " + calculateMin() + " minutes, " + "and " + calculateSec() + " seconds";
        return result;
    }

}

