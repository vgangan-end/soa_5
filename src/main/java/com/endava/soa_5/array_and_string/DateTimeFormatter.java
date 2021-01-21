package com.endava.soa_5.array_and_string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatter {
    DateTimeFormatter() {

        System.out.println("Default date " + date);
    }

    private Date date = new Date();
    private String timeFormat;

    public void setTimeFormat(String regexFormat) {
        this.timeFormat = regexFormat;

    }

    private String getTimeFormat() {
        return this.timeFormat;
    }

    public static void main(String[] args) {


    }

    public String transformDateFormat() {

        SimpleDateFormat dateFormat = new SimpleDateFormat(getTimeFormat());
        String reformedDate = dateFormat.format(date);
        return reformedDate;

    }

}
