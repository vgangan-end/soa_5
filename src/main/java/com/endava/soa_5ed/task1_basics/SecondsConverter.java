package com.endava.soa_5ed.task1_basics;

public class SecondsConverter {
    //    Write a method that converts a total number of seconds to hours, minutes, and seconds.
    final static int secondsInHour = 3600;
    final static int secondsInMinute = 60;

    int convertToHours(int time){
        return time / secondsInHour;
    }
    int convertToMinutes(int time){
        return time % secondsInHour / secondsInMinute;
    }
    int convertToSeconds(int time){
        return time % secondsInMinute;
    }
}
