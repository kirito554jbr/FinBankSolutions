package Client;


import java.util.*;

public class Compte {
    private String numeroCompte;
    private double solde;
    private TypeCompte typeCompte;
    private Set<Transactions> historiqueTransactions ;


    public Compte(String numeroCompte, TypeCompte typeCompte) {
        this.numeroCompte = numeroCompte;
        this.typeCompte = typeCompte;
        this.solde = 0.0;
        this.historiqueTransactions = new HashSet<>();
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public Set<Transactions> getHistoriqueTransactions() {
        return historiqueTransactions;
    }

    public void depot(double montant) throws IllegalArgumentException {
        if (montant <= 0) {
            System.out.println("Le montant doit être positif");
        }
        solde += montant;
        Transactions transaction = new Transactions(TypeTransaction.DEPOT, montant, null, numeroCompte);
        historiqueTransactions.add(transaction);
    }


    public void retrait(double montant) {
        if (montant <= 0) {
            System.out.println("Le montant doit être positif");
        }
        if (solde < montant) {
            System.out.println("Solde insuffisant");
        }
        solde -= montant;
        Transactions transaction = new Transactions(TypeTransaction.RETRAIT, montant, numeroCompte, null);
        historiqueTransactions.add(transaction);
    }



    public void transfer(double montant, String compteSource)  {
        if (montant <= 0) {
            System.out.println("Le montant doit être positif");
        }
        solde += montant;
        Transactions transaction = new Transactions(TypeTransaction.VIREMENT, montant, compteSource, numeroCompte);
        historiqueTransactions.add(transaction);
    }










    //    public String[] getHistoriqueTransactions() {
//        return historiqueTransactions;
//    }

//    public void setHistoriqueTransactions(String[] historiqueTransactions) {
//        this.historiqueTransactions = historiqueTransactions;
//    }

//    public  float ConsulterSolde(){
//        return this.solde;
//    }


}
