package BasicJavaHomeWork;
import java.util.Scanner;

class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number of the day: ");
        int day = in.nextInt();

        switch (day){
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
                System.out.println("4rd day of the week is Thursday");
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
                System.out.println("Wrong day of the week!");
        }

        in.close();
    }

}
