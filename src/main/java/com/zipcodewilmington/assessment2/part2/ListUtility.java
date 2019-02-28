package com.zipcodewilmington.assessment2.part2;

import java.util.List;
import java.util.ArrayList;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {

        return list.add(i);
    }

    public Integer size() {
        Integer count = 0;
        for (Integer el : list) {
            count++;
        }
        return count;
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
