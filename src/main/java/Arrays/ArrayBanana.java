package Arrays;

public class ArrayBanana {
    public static int calculateProduce(int[] a) {
        int result = 1;
        int i = 0;
        while (i < a.length) {
            result = result * a[i];
            i++;
        }
        return result;
    }
}