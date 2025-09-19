package Client;

import java.util.HashMap;
import java.util.HashSet;

public class UserService {

    private static UserService instance;
    private Compte user;
    private Client client;
    private HashMap<Integer, Compte> comptes;
//    private HashSet<Integer>storeClients;
//    private Gestionnaire gestionnaire;
    private int storeClients;

    public UserService() {
        this.comptes = new HashMap<>();
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();  // create only once
        }
        return instance;
    }


//    public UserService(String nom, String prenom, String email, String password, Client.Compte user, Client.Client client) {
//        this.nom = nom;
//        this.prenom = prenom;
//        this.email = email;
//        this.password = password;
//        this.user = user;
//        this.client = client;
//    }



    public void ajouterCompte(String nom,String prenom,String email,String motDePasse){
        this.user = new Compte();
        this.client = new Client(nom, prenom, email, motDePasse);
        this.client.ajouterCompte(this.user);


        comptes.put(this.client.getIdClient(), this.user);
//        storeClients.add(this.client.getIdClient());

        storeClients = this.client.getIdClient();

        System.out.println(this.client.getComptes());
        System.out.println("*************************************");
        System.out.println(this.client);
        System.out.println("*************************************");

    }

    public void supprimerCompte(int numeroCompte){
        this.client.supprimerCompte(numeroCompte);
        System.out.println("***********");
    }

    public void deposit(double montant, Compte compte) {

        System.out.println(compte.getNumeroCompte());
        int key = this.findKeyByNumeroCompte(compte.getNumeroCompte());
        System.out.println(key);
        Compte c = comptes.get(key);
        if(c == null) {
            c.setSolde(montant);
        }else {
            System.out.println("Compte introuvable !");
        }
//        comptes.put(this.client.getIdClient(), this.user.setSolde(montant));
    }

    public Integer findKeyByNumeroCompte(int numeroCompte) {

        for (Compte c : comptes.values()) {
//            System.out.println(c.toString());
            if  (c.getNumeroCompte() == numeroCompte) {
                return c.getNumeroCompte();
            }
        }
        return null;

    }



    public void getAllComptes() {
        System.out.println(comptes);
    }


    public void getComptes(){

//        return (Compte) this.client.getComptes();
        System.out.println(this.client.getComptes());
    }

    public Compte getCompteToUse(){
//        this.client = new Client(nom, prenom, email, motDePasse);


        return comptes.get(storeClients);

//        this.
//        this.client.getComptes();

    }

//    public int getClientByName(String name){
//        for (Client c : storeClients) {
//            if (c.getNom().equalsIgnoreCase(name)) { // ignore case
//                return c.getIdClient();
//            }
//        }
//        return 0; // not found
//    }
}
