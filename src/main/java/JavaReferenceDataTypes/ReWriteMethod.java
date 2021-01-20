package JavaReferenceDataTypes;

public class ReWriteMethod {
    public static void main(String[] args) {
        System.out.println(getResult(new int[]{7, 1, 2, 4, 6}));
        System.out.println(findIndexOfNumberInArray(new int[]{2, 5, 9, 7, 6}, 4));
        System.out.println(countNumberInArray(new int[]{2, 3, 4, 5, 6, 7, 8}, 6));
    }

    //Multiplies all number in an array
    public static int getResult(int[] numbers) {
        int result = 1;
        int index = 0;
        while (index < numbers.length) {
            result *= numbers[index];
            index++;
        }
        return result;
    }

    //Find the index of a number in array
    public static int findIndexOfNumberInArray(int[] listOfNumbers, int numberToFind) {
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }

    //Counts the references of a number in a array
    public static int countNumberInArray(int[] listOfNumbers, int numberToFind) {
        int counter = 0;
        for (int number : listOfNumbers) {
            if (number == numberToFind) {
                counter++;
            }
        }
        return counter;
    }
}
