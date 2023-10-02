package com.driver;

public class RWOnly {
    private String name;

    //Getter for read only access
    public String getName() {
        return name;
    }
    //Setter for write only access

    public void setName(String name) {
        this.name = name;
    }
}
