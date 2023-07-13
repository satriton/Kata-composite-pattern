package org.example.solution.partie1;

import java.util.List;

public interface Manager {
    void recruitPerson(Person person);
    void firePerson(Person person);
    List<Person> getPerson();
    void communicate(String information);
}