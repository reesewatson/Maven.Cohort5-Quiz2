package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

        return value > 5;

    public Boolean isLessThan7(Integer value) {

        return value < 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        return isLessThan7(Integer valueToEvaluate) && isGreterThan5(Integer valueToEvaluate);
    }

    public Boolean startsWith(String string, Character character){

        return (string.charAt(0) == Character.toLowerCase(character)) || (string.charAt(0) == Character.toUpperCase(character));
    }

}
