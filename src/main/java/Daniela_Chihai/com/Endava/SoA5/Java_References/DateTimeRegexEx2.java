package Daniela_Chihai.com.Endava.SoA5.Java_References;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeRegexEx2 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now(); // current date
        DateTimeFormatter dateObjFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // format for our date
        String formattedDate = currentDateTime.format(dateObjFormat); // assigning to our date, the format
        System.out.println("Current Date: " + formattedDate);
        System.out.println("-------------------------\n");
        DateTimeFormatter dateObjFormat1 = DateTimeFormatter.ofPattern("MM-dd-yy HH:mm");
        String dateFormattedAgain = currentDateTime.format(dateObjFormat1);
        System.out.println("Modified Format Date: " + dateFormattedAgain);
    }
}
