package Client;

import Personne.Personne;

import java.util.*;

public class Client extends Personne {


//    private int idClient;
//    static Compte compte;
////    HashMap<String,Compte>;
////    HashMap<String,Compte> comptes=new HashMap<String,Compte>();
//
//
//    public Client(Compte compte){
//            this.compte = compte;
//    }
//
//    public int getIdClient() {
//        return idClient;
//    }


//    public static float ConsulterSolde(){
//        return compte.ConsulterSolde();
//    }


//    public void ConsulterLeRelevéBancaire(){
    /// /        this.compte
//    }


    private static int compteurId = 9999;
    private int idClient;
    private Map<String, Compte> comptes;

    public Client(String nom, String prenom, String email, String motDePasse) {
        super(nom, prenom, email, motDePasse);
        this.idClient = compteurId++;
        this.comptes = new HashMap<>();
    }


    // Getters
    public int getIdClient() {
        return idClient;
    }


    public Map<String, Compte> getComptes() {
        return new HashMap<>(comptes);
    }

    // Méthodes métier
    public void ajouterCompte(Compte compte) {
        comptes.put(compte.getNumeroCompte(), compte);
    }

    public void supprimerCompte(String numeroCompte) {
        comptes.remove(numeroCompte);
    }

    public Compte getCompte(String numeroCompte) {
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
