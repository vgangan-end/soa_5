package Arrays;

public class Pineapple {
    public static int countOccurrencesOfElement(int[] a, int element) {
        int count = 0;
        for (int currentElement: a) {
            if (currentElement == element) {
                count++;
            }
        }
        return count;
    }
}
