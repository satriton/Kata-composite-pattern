package org.example.solution.partie1;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void communicate(String information);
}