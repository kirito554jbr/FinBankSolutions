package Client;

import java.util.HashSet;

public class Compte {
    private int numeroCompte;
    private float solde;
    private String typeCompte;
    private HashSet<Transactions> historiqueTransactions ;

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

//    public String[] getHistoriqueTransactions() {
//        return historiqueTransactions;
//    }

//    public void setHistoriqueTransactions(String[] historiqueTransactions) {
//        this.historiqueTransactions = historiqueTransactions;
//    }

    public  float ConsulterSolde(){
        return this.solde;
    }


}
