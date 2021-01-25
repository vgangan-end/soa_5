public class Main {

    public static void main(String[] args) {
        int[] array = {41, 13, 7, -20, 2, 13};
        int[] arrayWorstCase = {41, 13, 13, 7, 2, -20};
        int[] someArray = {1, 2, 3, 4, 5};
        // iteratia 2: {13, 13, 7, 2, -20, 41}
        // iteratia 3: {13, 7, 2, -20, 13, 41}
        // iteratia 4: {7, 2, -20 ,13, 13, 41}
        // iteratia 5: {2, -20, 7, 13, 13, 41}
        // iteratia 6: {-20, 2, 7, 13, 13, 41}
//        System.out.println(Algorithms.isSorted(array));
        printArray(array);
        Algorithms.bubbleSort(array);
        printArray(array);
        System.out.println("#################\n");

    }

    private static void printArray(int[] array) {
        for (int number : array) { // number replaces array[i]
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
