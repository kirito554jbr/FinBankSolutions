package Client;
import Personne.Personne;

import java.util.HashMap;

public class Client extends Personne {


    private int idClient;
    static Compte compte;
//    HashMap<String,Compte>;
//    HashMap<String,Compte> comptes=new HashMap<String,Compte>();


    public Client(Compte compte){
            this.compte = compte;
    }

    public int getIdClient() {
        return idClient;
    }


    public static float ConsulterSolde(){
        return compte.ConsulterSolde();
    }


    public void ConsulterLeRelevéBancaire(){
//        this.compte
    }
}
