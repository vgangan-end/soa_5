package Daniela_Chihai.com.Endava.SoA5.Java_References;

import java.util.Calendar;
import java.util.Date;

public class DateTimeRegexEx3 {
    public static String getDayOfTheWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String dayOfWeek;
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid Date";
        }
        return dayOfWeek;
    }
}

