package com.endava.soa_5.array_and_string;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeeks {
    DayOfWeeks() {
    }

    private LocalDate localDate;
    private DayOfWeek dayOfWeek;
    private int year, month, day;


    public void setLocalDate() {
        localDate = LocalDate.of(getYear(), getMonth(), getDay());
    }

    public void setDateAndShowDayOfWeek() {
        setLocalDate();
        dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;

    }

    public void setDay(int day) {
        this.day = day;
    }

}
