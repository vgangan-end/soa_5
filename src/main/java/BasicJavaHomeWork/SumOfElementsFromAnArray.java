package BasicJavaHomeWork;

import java.util.Scanner;

public class SumOfElementsFromAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int enteredNumber = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= enteredNumber; i++) {
            sum = i + sum;
        }
        System.out.println(sum);

        int d = 0;
        int sum2 = 0;
        do {
            d++;
            sum2 = d + sum2;
        } while(d < enteredNumber);
        System.out.println(sum2);

        int x = 0;
        int sum3 = 0;
        while(x < enteredNumber){
            x++;
            sum3 = x + sum3;
        }
        System.out.println(sum3);

        in.close();
    }
}
