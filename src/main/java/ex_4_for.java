import java.util.Scanner;

public class ex_4_for {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = in.nextInt();
        for (int i = 0; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
