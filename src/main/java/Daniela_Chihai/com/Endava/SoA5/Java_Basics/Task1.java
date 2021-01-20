package Daniela_Chihai.com.Endava.SoA5.Java_Basics;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int nrOfSeconds = scanner.nextInt();  //we enter a number
        int hours = nrOfSeconds / 3600;         //divides our seconds into nr. of hours
        int minutes = (nrOfSeconds % 3600) / 60; //divides our seconds into nr. of minutes Left from that our
        int seconds = nrOfSeconds  % 60; //divides our seconds into nr. of seconds Left from our our
        System.out.printf("The time in hours, minutes and seconds is: %d hours %d minutes %d seconds", hours, minutes, seconds);
    }
}
