package Arrays;

import static Arrays.make.make;
import static Arrays.mus.mus;
import static Arrays.dub.dub;

public class makeDubMus {
    public static void main(String[] args) {
        int[] bob = make(5); // Array of elements (1,2,3,4,5)
        dub(bob); // Duplicated Array of elements (2,4,6,8,10)
        System.out.println(mus(bob)); // Sum of elements 2+4+6+8+10 = 30
    }
}