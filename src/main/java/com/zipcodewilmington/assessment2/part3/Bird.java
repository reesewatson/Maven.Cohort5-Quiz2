package com.zipcodewilmington.assessment2.part3;

public class Bird {

    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    private String migration;

    public String move() {

        return "fly";
    }

    public void setMigrationMonth(String expected) {
        this.migration = expected;
    }

    public String getMigrationMonth() {

        return migration;
    }
}
