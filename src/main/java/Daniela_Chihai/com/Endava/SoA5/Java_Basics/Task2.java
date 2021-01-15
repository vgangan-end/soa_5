package Daniela_Chihai.com.Endava.SoA5.Java_Basics;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers which would represent the start and the end range: ");
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        for (int i = startRange; i <= endRange; i++) {  //*declare the type of variable for i always FOR "for" loop
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Is divisible by 3 and 5!");
            } else if (i % 3 == 0) {                          //* each if else statement has a "{}"
                System.out.println("Is divisible by 3!");
            } else if (i % 5 == 0) {                          //* each if else statement has a "{}"
                System.out.println("Is divisible by 5!");
            } else {
                System.out.println("Isn't divisible by 3 and 5!");
            }
        }
    }
}