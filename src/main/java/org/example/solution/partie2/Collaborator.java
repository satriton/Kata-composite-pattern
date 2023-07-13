package org.example.solution.partie2;

import java.util.ArrayList;
import java.util.List;

public class Collaborator extends Person implements Manager {
    private List<Person> stagiaires;

    public Collaborator(String name) {
        super(name);
        this.stagiaires = new ArrayList<>();
    }

    public void recruitPerson(Person person) {
        stagiaires.add(person);
    }

    public void firePerson(Person person) {
        stagiaires.remove(person);
    }

    public List<Person> getPerson(){
        return stagiaires;
    }

    @Override
    public void communicate(String information) {
        System.out.println("Collaborator " + name + " sends the message: " + information);
        for (Person stagiaire : stagiaires) {
            stagiaire.communicate(information);
        }
    }

    @Override
    public int giveCost(){
        int sum = 5;
        for (Person stagiaire : stagiaires) {
            sum+=stagiaire.giveCost();
        }
        return sum;
    }
}