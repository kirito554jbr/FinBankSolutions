package Client;


import java.util.*;

public class Compte {
    private static int count = 5555;
    private int numeroCompte;
    private double solde;
    private TypeCompte typeCompte;
    private Set<Transactions> historiqueTransactions ;


    public Compte() {
        this.numeroCompte = count++;
        this.typeCompte = TypeCompte.COURANT;
        this.solde = 0.0;
        this.historiqueTransactions = new HashSet<>();
    }

//    public Compte(int count, int numeroCompte, double solde) {
//        this.count = count;
//        this.numeroCompte = numeroCompte;
//        this.solde = solde;
//        this.typeCompte = typeCompte;
//        this.historiqueTransactions = historiqueTransactions;
//    }

    public int getNumeroCompte() {
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

    public void depot(double montant) {
        if (montant <= 0) {
            System.out.println("Le montant doit être positif");
        }
        solde += montant;
        Transactions transaction = new Transactions(TypeTransaction.DEPOT, montant, 0, numeroCompte);
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
        Transactions transaction = new Transactions(TypeTransaction.RETRAIT, montant, numeroCompte, 0);
        historiqueTransactions.add(transaction);
    }



//    public void transfer(double montant, String compteSource)  {
//        if (montant <= 0) {
//            System.out.println("Le montant doit être positif");
//        }
//        solde += montant;
//        Transactions transaction = new Transactions(TypeTransaction.VIREMENT, montant, compteSource, numeroCompte);
//        historiqueTransactions.add(transaction);
//    }










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
