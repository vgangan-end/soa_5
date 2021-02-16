package com.endava.soa_5.JUnit_and_Hamcrest;

public class MagicSquare {

    private int[][] intArray;
    private int magicSquareConstant;

    public MagicSquare(int[][] intArray) {
        this.intArray = intArray;
        magicSquareConstant = intArray.length * (intArray.length * intArray.length + 1) / 2;
    }

    public boolean isNotEmptyArray() {
        if (intArray.length == 0) {
            return false;
        }
        return true;
    }

    public boolean isMultidimensionalArray() {
        try {
            int control = intArray[0][1];
        } catch (ArrayIndexOutOfBoundsException exception) {
            return false;
        }
        return true;
    }

    public boolean isSquare() {
        boolean isArraySquare = true;
        if (isMultidimensionalArray()) {
            for (int row = 0; row < intArray.length; row++) {
                for (int column = 0; column < intArray[row].length; column++) {
                    if (intArray.length != intArray[row].length)
                        isArraySquare = false;
                }
            }
            return isArraySquare;
        }
        return false;
    }

    private boolean isColumnEqualWithConstant() {
        for (int i = 0; i < intArray.length; i++) {
            int columnSum = 0;
            for (int j = 0; j < intArray.length; j++) {
                columnSum += intArray[j][i];
            }
            if (columnSum != magicSquareConstant) {
                return false;
            }
        }
        return true;
    }

    private boolean isRowEqualWithConstant() {
        for (int i = 0; i < intArray.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < intArray.length; j++) {
                rowSum += intArray[i][j];
            }
            if (rowSum != magicSquareConstant) {
                return false;
            }
        }
        return true;
    }

    private boolean isDiagonalsEqualWithConstant() {
        for (int i = 0; i < intArray.length; i++) {
            int diagonalSum = 0;
            int diagonalSum2 = 0;
            for (int j = 0; j < intArray.length; j++) {
                diagonalSum += intArray[j][j];
                diagonalSum2 += intArray[j][intArray.length - 1 - j];
            }
            if (diagonalSum != magicSquareConstant && diagonalSum2 != magicSquareConstant) {
                return false;
            }
        }
        return true;
    }

    public boolean isPositiveAllValuesIntoSquare() {
        if (!isSquare()) {
            return false;
        }
        int positiveNr = 0;
        int value;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                value = intArray[i][j];
                if (value <= positiveNr) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isMagicSquare() {
        return isNotEmptyArray() && isColumnEqualWithConstant() && isRowEqualWithConstant()
                && isDiagonalsEqualWithConstant() && isPositiveAllValuesIntoSquare();
    }
}
