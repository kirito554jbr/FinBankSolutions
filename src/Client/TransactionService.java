package Client;

public class TransactionService {
    private Compte compte;
    private UserService user;

    public TransactionService() {
        this.compte = new Compte();
    }

    public void depot(Compte userCompte,double solde) {
//        System.out.println(userCompte);
        this.compte.depot(solde);
        this.user = new UserService();
        this.user.deposit(solde, userCompte);


    }

    public void retrait(double montant) {
        this.compte.retrait(montant);

    }


    public void getSolde() {

        System.out.println(this.compte.getSolde());
    }
}
