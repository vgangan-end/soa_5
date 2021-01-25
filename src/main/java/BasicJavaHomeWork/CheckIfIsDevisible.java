package BasicJavaHomeWork;

import java.util.Scanner;

public class CheckIfIsDevisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int enteredNumber = in.nextInt();
        int restOfNumbA = enteredNumber % 3;
        int restOfNumbB = enteredNumber % 5;

        if (restOfNumbA == 0 && restOfNumbB == 0){
            System.out.println(enteredNumber + " is divisible by 3 and 5");
        } else if (restOfNumbA == 0){
            System.out.println(enteredNumber + " is divisible by 3");
        } else if (restOfNumbB == 0) {
            System.out.println(enteredNumber + " is divisible by 5");
        } else {
            System.out.println(enteredNumber + "  is NOT divisible by 3 and 5");
        }

        in.close();

    }
}
