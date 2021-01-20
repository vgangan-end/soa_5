package JavaReferenceDataTypes;

import com.mifmif.common.regex.Generex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RegexManipulation {
    public static void main(String[] args) throws ParseException {
        RegexManipulation.getRandomString();
        System.out.println();
        RegexManipulation.changeTimeFormat();
        System.out.println();
        System.out.println("Signing the declaration of independence of the USA was on: " + getDayOfTheWeek("02/08/1776"));
        System.out.println("Signing the declaration of independence of the Moldova was on: " + getDayOfTheWeek("02/03/1992"));
        System.out.println("Inception was released on: " + getDayOfTheWeek("08/07/2010"));
    }

    public static String getRandomString() {
        Generex generex = new Generex("([0-9]+[a-z]+[A-Z]+[!@#$%^&*()_+-]){1,10}");
        String myString = generex.random();
        System.out.println("Generated string: " + myString);

        String excludeSpecialCharacters = myString.replaceAll("[!@#$%^&*()_+-]", ""); //exclude special characters
        System.out.println("String with removed symbols: " + excludeSpecialCharacters);

        String excludeNumbers = myString.replaceAll("[0-9]", ""); //exclude numbers
        System.out.println("String with removed numeric characters: " + excludeNumbers);

        String excludeLetters = myString.replaceAll("[a-z A-Z]", ""); //exclude letters
        System.out.println("String with removed alphabetic characters: " + excludeLetters);
        return myString;

    }

    public static String changeTimeFormat() {
        DateFormat defaultFormat = new SimpleDateFormat("dd-MM-yyyy HH:MM:ss"); //first time format
        Date date = new Date();
        String changeFormat = defaultFormat.format(date); //convert Date to String
        System.out.println(changeFormat);

        DateFormat updateFormat = new SimpleDateFormat("MMM-dd-yyyy HH:MM"); //second time format
        Date dateUpdateFormat = new Date();
        String updateDateFormat = updateFormat.format(dateUpdateFormat); //convert Date to String
        updateDateFormat = updateDateFormat.replaceAll("-", "/");
        updateDateFormat = updateDateFormat.toUpperCase(Locale.ROOT);
        System.out.println(updateDateFormat);

        return String.valueOf(date);
    }

    public static String getDayOfTheWeek(String dateOfEvent) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(dateOfEvent);
        DateFormat format2 = new SimpleDateFormat("EEEE");
        String dayOfWeek = format2.format(date);
        return dayOfWeek;
    }
}
