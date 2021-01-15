package BasicJavaHomeWork;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int numb = in.nextInt();
        int b;
        int c = 0;

        for (int a=1; a<=numb;a++) {
            b = a + c;
            c = b;
        }
        System.out.println(c);

        int d = 0;
        int e;
        int f = 0;
        do {
            d++;
            e = d + f;
            f = e;
        } while(d<numb);
        System.out.println(f);

        int x = 0;
        int y;
        int z = 0;
        while(x<numb){
            x++;
            y = x + z;
            z = y;
        }
        System.out.println(z);

        in.close();
    }
}
