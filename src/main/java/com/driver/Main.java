package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an object of RWOnly class
        RWOnly obj = new RWOnly();

        // Set a value to 'name' using the setter
        obj.setName("John");

        // Access 'name' using the getter
        String name = obj.getName();
        System.out.println("Name: " + name); // Output: Name: John
    }
}
