package BasicJavaHomeWork;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = num % 3;
        int a = num % 5;

        if (a == 0 && i == 0){
            System.out.println(num + " is divisible by 3 and 5");
        } else if (i == 0){
            System.out.println(num + " is divisible by 3");
        } else if (a == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + "  is NOT divisible by 3 and 5");
        }

        in.close();

    }
}
