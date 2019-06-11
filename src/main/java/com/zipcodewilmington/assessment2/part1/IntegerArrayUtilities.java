package com.zipcodewilmington.assessment2.part1;

import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0;
    }

    public Object[] range(int start, int stop) {
        if (stop - start <= 0) {
            return new Object[0];
        }
        int length = (start - stop) + 1;
        return (Object[]) IntStream.range(start, stop + 1).boxed().toArray();
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[0] * array[1];
    }
}
