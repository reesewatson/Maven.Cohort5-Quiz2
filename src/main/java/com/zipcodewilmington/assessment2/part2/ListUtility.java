package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Collectors;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(Object i) {
        //Null pointer exception
        if (i == null) return list.add(null);

        return list.add((Integer) i);
    }

    public Integer size() {
        Integer count = 0;
        for (Integer el : list) {
            count++;
        }
        return count;
    }

    public List<Integer> getUnique() {
        Set<Integer> set = new HashSet(list);
        return set.stream().collect(Collectors.toList());
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
        return (Integer) ArrayUtility.mostCommon(list.toArray(new Integer[0]));
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
