package com.endava.soa_5ed.tasks.task1_basics;

public class SecondsConverter {
    //    Write a method that converts a total number of seconds to hours, minutes, and seconds.
    final static int secondsInHour = 3600;
    final static int secondsInMinute = 60;
    int time;

    public void setTime(int time){
        this.time = time;
    }
    public int convertToHours(){
        return time / secondsInHour;
    }
    public int convertToMinutes(){
        return time % secondsInHour / secondsInMinute;
    }
    public int convertToSeconds(){
        return time % secondsInMinute;
    }

    @Override
    public String toString() {
        return (convertToHours() + " hours, " +convertToMinutes() + " minutes and " + convertToSeconds() + " seconds.");
    }
}
