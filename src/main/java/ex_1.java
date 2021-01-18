import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        int seconds;
        int minutes;
        int hours;
        int days;
        int weeks;
        int seconds_out;
        Scanner in = new Scanner(System.in);
            System.out.println("Enter seconds to convert: ");
        seconds = in.nextInt();
        weeks = seconds / 604800;
        days = (seconds % 604800) / 86400;
        hours = (seconds % 86400) / 3600;
        minutes = (seconds % 3600) / 60;
        seconds_out = (seconds % 3600) % 60;
            System.out.println( seconds + " seconds = " + weeks + " weeks, " + days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds_out + " seconds.");
    }
}
