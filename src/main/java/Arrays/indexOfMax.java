package Arrays;

public class indexOfMax {
    public static int indexOfMax(int[] n) {
        if (n.length == 0) {
            return -1;
        }
            int max = 0;
            for (int i = 1; i < n.length; i++) {
                if (n[i] > n[max]) {
                    max = i;
            }
        }
        return max;
    }
}