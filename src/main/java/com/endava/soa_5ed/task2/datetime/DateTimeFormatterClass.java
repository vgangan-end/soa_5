package com.endava.soa_5ed.task2.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class DateTimeFormatterClass {
    private LocalDateTime dateTime;
    private String pattern;

    public DateTimeFormatterClass(String pattern) {
        this.pattern = pattern;
    } //constructor for exercise 3 - day of week

    public DateTimeFormatterClass() {
        dateTime = LocalDateTime.now();
    } //constructor for exercise 2 - date formatter

    public DateTimeFormatter getFormat(String dateTimePattern) {
        return createFormat(dateTimePattern);
    }

    public String getFormattedDateTime(DateTimeFormatter dateTimePattern) {
        return formatTimeDate(dateTimePattern).toUpperCase(Locale.ROOT);
    }

    public String getDayOfWeek(String date) {
        return returnDayOfWeek(date);
    }

    private String formatTimeDate(DateTimeFormatter dateTimePattern) {
        return dateTime.format(dateTimePattern);
    }

    private DateTimeFormatter createFormat(String pattern) {
        return new DateTimeFormatterBuilder().parseCaseSensitive().appendPattern(pattern).toFormatter();
    }

    private String returnDayOfWeek(String date) {
        return LocalDate.parse(date, createFormat(pattern)).getDayOfWeek().toString().toLowerCase();
    }
}
