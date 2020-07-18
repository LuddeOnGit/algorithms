package org.pg4200.ex01;

import org.pg4200.ex01.ArrayUtils;

public class ArrayUtilsImp implements ArrayUtils {
    @java.lang.Override
    public int min(int[] array) throws IllegalArgumentException {
        checkArray(array);

        int currMin = array[0];

        for(int i = 1; i < array.length; i++) {
            currMin = Math.min(currMin, array[i]);
        }
        return currMin;
    }

    @java.lang.Override
    public int max(int[] array) throws IllegalArgumentException {
        checkArray(array);

        int currMax = array[0];

        for(int i = 1; i < array.length; i++) {
            currMax = Math.max(currMax, array[i]);
        }
        return currMax;
    }

    @java.lang.Override
    public double mean(int[] array) throws IllegalArgumentException {
        checkArray(array);

        int sum = 0;

        for (int value : array) {
            sum += value;
        }
        return (double)sum/array.length;
    }

    private void checkArray(int[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Invalid empty array as input");
    }
}
