package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {

        Integer[] intArray = new Integer[start - stop];
        Integer count = 0;
        for (i = start; i < stop; i ++) {
            intArray[i] = i;
            count ++;
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
