package JavaBasics;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = in.nextInt();
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of the numbers= " + sum);
    }
}