package org.example.solution.partie2;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void communicate(String information);

    public abstract int giveCost();
}