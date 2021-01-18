import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int n, sum = 0, i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = in.nextInt();
        do {
            System.out.println("Sum of the numbers= " + sum);
            i++;
            sum +=i;
        }
        while (i <= n);
        }
    }