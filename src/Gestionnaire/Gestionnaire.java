package Gestionnaire;
import Personne.Personne;

import java.util.HashMap;
import Client.*;

public class Gestionnaire extends Personne {

    private static int compteurId = 2000;
    private int idGestionnaire;

    private Compte user;
    private Client client;

    public Gestionnaire(String nom, String prenom, String email, String motDePasse) {
        super(nom, prenom, email, motDePasse);
        this.idGestionnaire = compteurId++;
    }






    public int getIdGestionnaire() {
        return idGestionnaire;
    }

    @Override
    public String toString() {
        return String.format("Gestionnaire %d: %s", idGestionnaire, super.toString());
    }
}
