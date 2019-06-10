package com.zipcodewilmington.assessment2.part2.listutility;

import com.zipcodewilmington.assessment2.part2.ListUtility;
import org.junit.Assert;
import org.junit.Test;

public class MostCommonTest {

    @Test
    public void test1() {
        Object mostCommonValue = 8193;
        Object[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }

    @Test
    public void test2() {
        Object mostCommonValue = 6783;
        Object[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }


    @Test
    public void test3() {
        Object mostCommonValue = null;
        Object[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }

    @Test
    public void test4() {
        Object mostCommonValue = Integer.MAX_VALUE;
        Object[] valuesToAdd = {mostCommonValue, mostCommonValue, mostCommonValue, 10};
        test(valuesToAdd, mostCommonValue);
    }


    public void test(Object[] valuesToAdd, Object mostCommonValue) {
        //Given
        ListUtility utility = new ListUtility();
        for (Object valueToAdd : valuesToAdd) {
            utility.add(valueToAdd);
        }

        //When
        Integer actual = utility.mostCommon();

        //Then
        Assert.assertEquals(mostCommonValue, actual);
    }

}
