package org.example.solution.partie1;

public class Main {
    public static void main(String[] args) {
        CEO nomis = new CEO("Stephane Nomis");

        AgencyChief berges = new AgencyChief("Stephane Berges");
        AgencyChief toulouse = new AgencyChief("Toulouse");

        Collaborator merlin  = new Collaborator("merlin");
        Collaborator valentin = new Collaborator("valentin");
        Collaborator jean = new Collaborator("jean");

        berges.recruitPerson(merlin);
        berges.recruitPerson(valentin);
        toulouse.recruitPerson(jean);

        nomis.recruitPerson(berges);
        nomis.recruitPerson(toulouse);

        nomis.communicate("Venez au prochain AllHand !");
    }
}