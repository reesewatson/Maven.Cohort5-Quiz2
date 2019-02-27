package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer [] newArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i ++) {
            newArray[i] += array1[i];
        }
        for (int i = 0; i < array2.length; i ++) {
            newArray[i] += array2[i];
        }
        return newArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        Integer [] newArray = new Integer[array.length];
        Integer given = 0;
        for (int i = 0; i < array.length; i ++) {
            given += array[i];
            return rotate(newArray, given);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {


            Integer result = new Integer[array1.length + array2.length];
            Integer count = 0;

            for (int i = 0; i < result.length; i++)
            {
                Integer currentInt = result[i];;

                if (currentInt == result[i])
                {
                    count++;
                }
            }
            return count;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
