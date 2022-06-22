package com.codedifferently.assessment01.part01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerArrayUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 15;

        // : When
        Integer actual = IntegerArrayUtils.getSum(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 120;

        // : When
        Integer actual = IntegerArrayUtils.getProduct(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAverageTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Double expected = 3.0;

        // : When
        Double actual = IntegerArrayUtils.getAverage(input);

        // : Then
        Assertions.assertEquals(expected, actual, 0.01);
    }
}
