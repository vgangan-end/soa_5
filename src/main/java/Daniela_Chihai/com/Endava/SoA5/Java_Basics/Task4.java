package Daniela_Chihai.com.Endava.SoA5.Java_Basics;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last number up to which the sum will be calculated:");
        int sum = 0; //our first sum, initializing our sum
        int lastNumber = scanner.nextInt();
        for (int i = 0; i <= lastNumber; i++) {  //go through all the elements
            sum = sum + i;
        }
        System.out.println("The sum for our numbers is: " + sum);
    }
}
