package Client;

import Personne.Personne;

import java.util.*;

public class Client extends Personne {

//    private static Client instance;
    private static int compteurId = 9999;
    private int idClient;
    private final Map<Integer, Compte> comptes;


    public Client(String nom, String prenom, String email, String motDePasse) {
        super(nom, prenom, email, motDePasse);
        this.idClient = compteurId++;
        this.comptes = new HashMap<>();
    }

//    public static Client getInstance(String nom, String prenom, String email, String motDePasse) {
//        if (instance == null) {
//            instance = new Client( nom,  prenom,  email, motDePasse);  // create only once
//        }
//        return instance;
//    }

    // Getters
    public int getIdClient() {
        return idClient;
    }

    public Map<Integer, Compte> getComptes() {
        return comptes;
    }



//    public void getCompteNumero(){
//
//    }


    // Méthodes métier
    public String ajouterCompte(Compte compte) {
        comptes.put(compte.getNumeroCompte(), compte);

//        return comptes;
        return "Un nouveau client a été ajouté";
    }


    public void supprimerCompte(int numeroCompte) {
        comptes.remove(numeroCompte);
    }

    public Compte getCompte(int numeroCompte) {
        return comptes.get(numeroCompte);
    }





//    public boolean posssedeCompte(String numeroCompte) {
//        return comptes.containsKey(numeroCompte);
//    }

    @Override
    public String toString() {
        return String.format("Client %d: %s - %d compte(s)", idClient, super.toString(), comptes.size());
    }
}
