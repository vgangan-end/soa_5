package JavaReferenceDataTypes;

public class ArrayIterator {
    public static void main(String[] args) {
        int result = getBiggestNumber(new int[]{2, 20, 6, 8, 9});
        System.out.println(result);
    }

    public static int getBiggestNumber(int[] listOfNumbers) {
        int maxNumber = 0;
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (maxNumber < listOfNumbers[i]) {
                maxNumber = listOfNumbers[i];
            }
        }
        return maxNumber;
    }
}
