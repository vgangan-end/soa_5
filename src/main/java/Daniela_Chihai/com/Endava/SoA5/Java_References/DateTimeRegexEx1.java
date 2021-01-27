package Daniela_Chihai.com.Endava.SoA5.Java_References;

import java.nio.charset.Charset;
import java.util.Random;

public class DateTimeRegexEx1 {
    public static String generateRandomString() {
        byte[] array = new byte[5];
        new Random().nextBytes(array); // constructor.method - generates a random array of bytes
        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) Math.abs(array[i]);
        }
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }


    public static String removeNumericalCharacters(String Str) {
        return Str.replaceAll("[0-9]", "");
    }

    public static String removeAlphabeticalCharacters(String Str) {
        return Str.replaceAll("[a-z]|[A-Z]", "");
    }

    public static String removeSymbolsCharacters(String Str) {
        return Str.replaceAll("[^\\w\\s]", "");
    }
}
