package com.zipcodewilmington.assessment2.part2.arrayutility;

import com.zipcodewilmington.assessment2.TestUtils;
import com.zipcodewilmington.assessment2.part2.ArrayUtility;
import org.junit.Before;
import org.junit.Test;

public class MergeTest {
    private ArrayUtility utility;

    @Before
    public void setup() {
        utility = new ArrayUtility();
    }

    @Test
    public void test1() {
        //Given
        Object[] array1 = {9};
        Object[] array2 = {6};
        Object[] expected = {9, 6};

        //When
        test(array1, array2, expected);
    }

    @Test
    public void test2() {
        //Given
        Object[] array1 = {5, 1, 8};
        Object[] array2 = {4, 2};
        Object[] expected = {5, 1, 8, 4, 2};

        // when
        test(array1, array2, expected);
    }



    @Test
    public void test3() {
        //Given
        Object[] array1 = {5, 1, 8, 9, 10};
        Object[] array2 = {4, 2, 11};
        Object[] expected = {9, 10, 11, 5, 1, 8, 4, 2};

        // when
        test(array1, array2, expected);
    }


    @Test
    public void test4() {
        //Given
        Object[] array1 = {1993, 1994, 1995};
        Object[] array2 = {2003, 2004, 2005};
        Object[] expected = {1993, 1994, 1995, 2003, 2004, 2005};

        // when
        test(array1, array2, expected);
    }


    private void test(Object[] array1, Object[] array2, Object[] expected) {
        // when
        Object[] actual = utility.merge(array1, array2);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
