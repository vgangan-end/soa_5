package JavaBasics;

import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number which can be divisible by 3 or 5:");
        n = in.nextInt();

        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println(n + " Is divisible by 3 and 5");
        }
        else if (n % 3 == 0) {
            System.out.println(n + " Is divisible by 3");
        }
        else if (n % 5 == 0) {
            System.out.println(n + " Is divisible by 5");
        } else {
            System.out.println(n + " Isn't divisible by 3 and 5");
        }
    }
}