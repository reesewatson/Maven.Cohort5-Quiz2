package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird implements Animal {

    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    private String migration;

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

}
