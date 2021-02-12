package com.endava.soa_5.JUnit_and_Hamcrest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MagicSquareTest {
    MagicSquare magicSquare;
    MagicSquare notMagicSquare;
    MagicSquare negativeValueNotSquare;
    MagicSquare notSquare;
    MagicSquare emptySquare;
    MagicSquare oneValueNotSquare;

    @BeforeEach
    void setUp() {
        magicSquare = new MagicSquare(new int[][]{{1, 15, 14, 4}, {10, 11, 8, 5}, {7, 6, 9, 12}, {16, 2, 3, 13}});
        notMagicSquare = new MagicSquare(new int[][]{{1, 15, 714, 4}, {10, 71, 8, 75}, {7, 6, 7, 12}, {16, 7, 3, 13}});
        notSquare = new MagicSquare(new int[][]{{4, 14, 12, 1}, {9, 7, 8, 12, 9}, {5, 0, 10, 99}, {16, 2, 9, 13}, {8}});
        negativeValueNotSquare = new MagicSquare(new int[][]{{4, 14, 12, 1}, {9, 7, 8, 12, 9}, {5, 0, 10, -7}, {16, 2, 9, 13}, {8}});
        emptySquare = new MagicSquare(new int[][]{});
        oneValueNotSquare = new MagicSquare(new int[][]{{1}});
    }

    @Test
    void checkIsMagicSquare() {
        assertThat("Check that biDimensional array is Magic Square", magicSquare.isMagicSquare(),
                is(true));
    }

    @Test
    void checkIsNotMagicSquare() {
        List<MagicSquare> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(notSquare, emptySquare, oneValueNotSquare, notMagicSquare, negativeValueNotSquare));
        for (MagicSquare square : squareList) {
            assertThat("Check that biDimensional array is NOT Magic Square", square.isMagicSquare(),
                    is(false));
        }
    }


    @Test
    void checkIsAllValuesPositiveIntoSquare() {
        List<MagicSquare> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(notMagicSquare, magicSquare));
        for (MagicSquare square : squareList) {
            assertThat("Check that biDimensional array all values are positive", square.isPositiveAllValuesIntoSquare(),
                    is(true));
        }
    }

    @Test
    void checkIsAtLeastOneNegativeValueIntoMagicSquare() {
        assertThat("Check that at least one value is negative or 0", negativeValueNotSquare.isPositiveAllValuesIntoSquare(),
                is(false));
    }

    @Test
    void checkIsSquare() {
        List<MagicSquare> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(magicSquare, notMagicSquare));
        for (MagicSquare square : squareList) {
            assertThat("Check that biDimensional array is Square", square.isSquare(),
                    is(true));
        }
    }

    @Test
    void checkIsNotSquare() {
        List<MagicSquare> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(emptySquare, oneValueNotSquare, notSquare, negativeValueNotSquare));
        for (MagicSquare square : squareList) {
            assertThat("Check that biDimensional array is not Square", notSquare.isSquare(),
                    is(false));
        }
    }

    @Test
    void checkIsNotEmptySquare() {
        List<MagicSquare> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(magicSquare, notMagicSquare, oneValueNotSquare, notSquare, negativeValueNotSquare));
        for (MagicSquare square : squareList) {
            assertThat("Check that biDimensional array is not Empty", square.isNotEmptyArray(),
                    is(true));
        }
    }

    @Test
    void checkIsEmptySquare() {
        assertThat("Check that biDimensional array is Empty", emptySquare.isNotEmptyArray(),
                is(false));
    }

    @Test
    void checkIsMultiDimensionalArray() {
        List<MagicSquare> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(magicSquare, notMagicSquare, notSquare, negativeValueNotSquare));
        for (MagicSquare square : squareList) {
            assertThat("Check that biDimensional array is not Empty", notMagicSquare.isMultidimensionalArray(),
                    is(true));
        }
    }

    @Test
    void checkIsNotMultiDimensionalArray() {
        List<MagicSquare> squareList = new ArrayList<>();
        squareList.addAll(Arrays.asList(oneValueNotSquare, emptySquare));
        for (MagicSquare square : squareList) {
            assertThat("Check that biDimensional array is Empty", oneValueNotSquare.isMultidimensionalArray(),
                    is(false));
        }
    }
}