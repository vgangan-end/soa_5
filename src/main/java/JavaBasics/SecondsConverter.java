package JavaBasics;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        int seconds;
        int minutes;
        int hours;
        int days;
        int weeks;
        int seconds_out;
        final int SECONDS_IN_A_WEEK = 604800;
        final int SECONDS_IN_A_DAY = 86400;
        final int SECONDS_IN_A_HOUR = 3600;
        final int SECONDS_IN_A_MINUTE = 60;
        Scanner in = new Scanner(System.in);
            System.out.println("Enter seconds to convert: ");
        seconds = in.nextInt();
        weeks = seconds / SECONDS_IN_A_WEEK;
        days = (seconds % SECONDS_IN_A_WEEK) / SECONDS_IN_A_DAY;
        hours = (seconds % SECONDS_IN_A_DAY) / SECONDS_IN_A_HOUR;
        minutes = (seconds % SECONDS_IN_A_HOUR) / SECONDS_IN_A_MINUTE;
        seconds_out = (seconds % SECONDS_IN_A_HOUR) % 60;
            System.out.println( seconds + " seconds = " + weeks + " weeks, " + days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds_out + " seconds.");
    }
}