package org.example.solution.partie1;

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
        System.out.println("AgencyChief " + super.name + " sends the message: " + information);
        for (Person collaborator : collaborators) {
            collaborator.communicate(information);
        }
    }
}