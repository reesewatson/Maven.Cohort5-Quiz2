package com.zipcodewilmington.assessment2.part1;

import java.lang.Math;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        if(start > stop) return null;
        int range = Math.abs(start - stop) + 1;
        Integer[] intArray = new Integer[range];

        for (int i = 0; i < range; i++) {
            intArray[i] = start + i;
        }

        return intArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[0] * array[1];
    }
}
