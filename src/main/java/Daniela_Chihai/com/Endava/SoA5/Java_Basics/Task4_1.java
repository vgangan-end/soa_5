package Daniela_Chihai.com.Endava.SoA5.Java_Basics;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the last number up to which the sum will be calculated:");
        int secondNUmber = scanner.nextInt();
        int i = 1;
        while (i <= secondNUmber) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum for our numbers is: " + sum);
    }
}
