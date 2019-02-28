package com.zipcodewilmington.assessment2.part2;

import java.util.List;
import java.util.ArrayList;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {
        if (i == null) return list.add(null);

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
        //Pay attention to return type (looking for unique values in List<Integer>), start there
        //Use for each loop to add each unique index to arrList
        //If arrList does not contain(i), add(i)
        List<Integer> arrList = new ArrayList<>();
        for (Integer i : list) {
            if (!arrList.contains(i)) {
                arrList.add(i);
            }
        }
        return arrList;
    }

    public String join() {
        //Pay attention to return type, joining list elements to string
        //Start by creating string var
        //Include commas and spaces
        String result = "";
        for(int i = 0; i < list.size() - 1; i++){
            result = result + list.get(i) + ", ";
            }
            result += list.get(list.size() - 1);

        return result;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
