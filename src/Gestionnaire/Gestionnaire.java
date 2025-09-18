package Gestionnaire;
import Personne.Personne;

public class Gestionnaire extends Personne {

    private static int compteurId = 2000;
    private int idGestionnaire;

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
