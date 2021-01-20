package Daniela_Chihai.com.Endava.SoA5.Java_Basics;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please a number: ");
        int dayOfWeek = scanner.nextInt();
            switch (dayOfWeek) {
                case 1:
                    System.out.println("1st day of the week is Monday");
                    break;
                case 2:
                    System.out.println("2nd day of the week is Tuesday");
                    break;
                case 3:
                    System.out.println("3rd day of the week is Wednesday");
                    break;
                case 4:
                    System.out.println("4th day of the week is Thursday");
                    break;
                case 5:
                    System.out.println("5th day of the week is Friday");
                    break;
                case 6:
                    System.out.println("6th day of the week is Saturday");
                    break;
                case 7:
                    System.out.println("7th day of the week is Sunday");
                    break;
                default:
                    System.out.println("This is not a day of the week");
            }
        }
    }

