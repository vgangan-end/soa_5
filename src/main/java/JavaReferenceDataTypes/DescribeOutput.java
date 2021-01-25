package JavaReferenceDataTypes;

public class DescribeOutput {
    // completeaza array-ul(cu arrayGenerator.length = 5) cu valori, atribuind ca valoare = indexul + 1
    public static int[] arrayGenerator(int lengthOFArray) {
        int[] listOfElements = new int[lengthOFArray];
        for (int i = 0; i < lengthOFArray; i++) {
            listOfElements[i] = i + 1;
        }
        return listOfElements;
    }

    //inmulteste valoarea de pe fiecare index cu 2
    public static void multiplyValueOfEachIndex(int[] valueOfIndex) {
        for (int i = 0; i < valueOfIndex.length; i++) {
            valueOfIndex[i] *= 2;
        }
    }

    // calculeaza suma tuturor elementelor din array
    public static int calculateSumOfElements(int[] calculateSum) {
        int counter = 0;
        for (int i = 0; i < calculateSum.length; i++) {
            counter += calculateSum[i];
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] multiplyArray = arrayGenerator(5); //a new array "multiplyArray" is created and gets the array created by "arrayGenerator" method
        multiplyValueOfEachIndex(multiplyArray);
        System.out.println(calculateSumOfElements(multiplyArray));
    }

}
