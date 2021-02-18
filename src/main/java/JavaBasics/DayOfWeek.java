package JavaBasics;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int day;
        Scanner in = new Scanner(System.in);
        System.out.println("Check day of the week: ");
        day = in.nextInt();
            switch (day){
                case 1:
                    System.out.println("1st day of the week is Monday");
                    break;
                case 2:
                    System.out.println("2nd day of the week is Tuesday");
                    break;
                case 3:
                    System.out.println("3th day of the week is Wednesday");
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
                    System.out.println ("There are only 7 days in a week. Accordingly, the input of " + day + " is invalid. Please use number between 1 and 7." );
            }
    }
}