package com.example.person;

public class Person {
    private String name;
    private String role;

    public Person() {}

    public Person(String name) {
        this.name = name;
        this.role = "N/A";
    }

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    @Override
    public String toString() {
        String output = "Person {name = " + this.name + ", role = " + role + "}";

        return output;
    }
}