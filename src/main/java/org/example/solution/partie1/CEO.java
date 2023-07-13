package org.example.solution.partie1;

import java.util.ArrayList;
import java.util.List;

public class CEO extends Person implements Manager {
    private List<Person> agencyChiefs;

    public CEO(String name) {
        super(name);
        agencyChiefs = new ArrayList<>();
    }

    public void recruitPerson(Person person) {
        agencyChiefs.add(person);
    }

    public void firePerson(Person person) {
        agencyChiefs.remove(person);
    }

    public List<Person> getPerson(){
        return agencyChiefs;
    }

    @Override
    public void communicate(String information) {
        System.out.println("CEO " + super.name + " sends the message: " + information);
        for (Person agencyChief : agencyChiefs) {
            agencyChief.communicate(information);
        }
    }
}