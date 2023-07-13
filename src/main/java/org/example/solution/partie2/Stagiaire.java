package org.example.solution.partie2;

public class Stagiaire extends Person {
    public Stagiaire(String name) {
        super(name);
    }

    @Override
    public void communicate(String information) {
        System.out.println("Stagiaire " + name + " receive the message: " + information);
    }

    @Override
    public int giveCost(){
        return 1;
    }
}