package BasicJavaHomeWork;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[]args) {
        System.out.print("Please type the seconds: ");
        Scanner in = new Scanner(System.in);
        int sec = in.nextInt();
        int restSec = sec % 60;
        int minutes = (sec / 60) % 60;
        int hours = sec / 3600;
        System.out.println(sec + " seconds = " + hours + " hours," + minutes + " minutes," + restSec + " seconds.");

        in.close();
    }
}