package org.example.solution.partie2;

public class Main {
    public static void main(String[] args) {
        CEO nomis = new CEO("Stephane Nomis");

        AgencyChief berges = new AgencyChief("Stephane Berges");
        AgencyChief toulouse = new AgencyChief("Toulouse");

        Collaborator merlin  = new Collaborator("merlin");
        Collaborator valentin = new Collaborator("valentin");
        Collaborator jean = new Collaborator("jean");

        Stagiaire paul = new Stagiaire("paul");

        nomis.recruitPerson(berges);
        nomis.recruitPerson(toulouse);

        berges.recruitPerson(merlin);
        berges.recruitPerson(valentin);
        toulouse.recruitPerson(jean);

        merlin.recruitPerson(paul);

        nomis.communicate("Vivement les vacances !");

        System.out.println("Le cout salariale d'Ippon est " + nomis.giveCost());
    }
}