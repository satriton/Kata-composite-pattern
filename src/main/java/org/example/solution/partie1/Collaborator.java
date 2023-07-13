package org.example.solution.partie1;

public class Collaborator extends Person {
    public Collaborator(String name) {
        super(name);
    }

    @Override
    public void communicate(String information) {
        System.out.println("Collaborator " + super.name + " receive the message: " + information);
    }
}