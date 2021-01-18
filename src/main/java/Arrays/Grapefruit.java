package Arrays;

public class Grapefruit {
    public static int findIndexOfElement(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -1;
    }


}
