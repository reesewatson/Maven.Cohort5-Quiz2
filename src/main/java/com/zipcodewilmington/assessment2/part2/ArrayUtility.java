package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class ArrayUtility {
    public Object[] merge(Object[] array1, Object[] array2) {
        List list = new ArrayList(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        return list.toArray();
    }


    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] newArray = new Integer[array.length];
        Integer given = 0;
        for (int i = 0; i < array.length; i++) {
            if (i - index < 0) {
                newArray[array.length - index + i] = array[i];
            } else {
                newArray[i - index] = array[i];
            }
        }
        return newArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        if (valueToEvaluate.equals(null)) {
            return null; }
        Integer count = 0;
        List list = new ArrayList(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        for (Object nums : list) {
            if (nums.equals(valueToEvaluate)) {
                count++;
            }
        } return count;
    }

    public static Integer countFrequency(Integer[] arr, Integer value) {
        Integer count = 0;
        List list = new ArrayList(Arrays.asList(arr));
        for (Object nums2 : list) {
            if (nums2.equals(value)) {
                count++;
            }
        } return count;
    }

    public static Integer mostCommon(Integer[] array) {
        int mostCommon = array[0];
        int count = (int) countFrequency(array, mostCommon);
        for (Integer num : array) {
            if (count < countFrequency(array, num)) {
                mostCommon = num;
            }
        } return mostCommon;
    }
}

