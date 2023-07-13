package org.example.solution.partie2;

import java.util.ArrayList;
import java.util.List;

public class AgencyChief extends Person implements Manager {
    private List<Person> collaborators;

    public AgencyChief(String name) {
        super(name);
        collaborators = new ArrayList<>();
    }

    public void recruitPerson(Person person) {
        collaborators.add(person);
    }

    public void firePerson(Person person) {
        collaborators.remove(person);
    }

    public List<Person> getPerson(){
        return collaborators;
    }

    @Override
    public void communicate(String information) {
        System.out.println("AgencyChief " + name + " sends the message: " + information);
        for (Person collaborator : collaborators) {
            collaborator.communicate(information);
        }
    }

    @Override
    public int giveCost(){
        int sum = 10;
        for (Person collaborator : collaborators) {
            sum+=collaborator.giveCost();
        }
        return sum;
    }
}