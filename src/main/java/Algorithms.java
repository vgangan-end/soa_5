public class Algorithms {

    public static void bubbleSort(int[] array) {
        int totalCount = 0;
        for (int j = 0; j < array.length;) {
            while (!isSorted(array)) {
                for (int i = 0; i <= array.length - 2 - j; i++) {
                    int currentNumber = array[i]; // optional line
                    int nextNumber = array[i + 1]; // optional line
                    if (currentNumber > nextNumber) {
                        int auxiliaryNumber = currentNumber + nextNumber;
                        currentNumber = auxiliaryNumber - currentNumber;
                        nextNumber = auxiliaryNumber - nextNumber;
                        array[i] = currentNumber;
                        array[i + 1] = nextNumber;
                    }
                    totalCount++;
                }
                j++;
            }
        }
        System.out.println("Total count: " + totalCount);
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
