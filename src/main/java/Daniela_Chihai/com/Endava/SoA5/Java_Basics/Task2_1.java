package Daniela_Chihai.com.Endava.SoA5.Java_Basics;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers which would represent the start and the end range: ");
        int n = scanner.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Is divisible by 3 and 5!");
        } else if (n % 3 == 0) {
            System.out.println("Is divisible by 3!");
        } else if (n % 5 == 0) {
            System.out.println("Is divisible by 5!");
        } else {
            System.out.println("Isn't divisible by 3 and 5!");
        }
    }
}
