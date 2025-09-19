import Client.*;


public class Main {
    public static void main(String[] args) {


        UserService user =  new UserService();
//        UserService user2 =  new UserService();

//        UserService user =  new UserService();

        user.ajouterCompte("aymen","jebrane","ay5jbr2023@gmail.com","0000");
        user.ajouterCompte("arya","stark","arya.stark@gmail.com","0000");
//        user.supprimerCompte(5555);
        System.out.println("*************************************");
        user.getComptes();
        System.out.println("*************************************");


        TransactionService transaction = new TransactionService();
        System.out.println("ciblee erreur ");
        System.out.println(user.getCompteToUse().toString());
        System.out.println("ciblee erreur ");

        transaction.depot(user.getCompteToUse(),3000.0,user);
//        transaction.depot(user.getComptes(),3000.0);

//        transaction.getSolde();
        System.out.println("*************************************");
//        transaction.depot(user.getCompteToUse(),3050.0);
//        transaction.getSolde();
        System.out.println("*************************************");

        user.getAllComptes();
        System.out.println("*************************************");
//
//        transaction.retrait(4000.0);
//        transaction.getSolde();





//        System.out.println("1.Gestionnaire");
//        System.out.println("2.Client");
//
//        Scanner user = new Scanner(System.in);
//
//        String choix = user.nextLine();
//
//        if  (choix.equals("1")) {
//
//        } else if (choix.equals("2")) {
//
//
//
//            System.out.println("\n=== ESPACE CLIENT ===");
//            System.out.println("Bienvenue " + Client.getPrenom() + " " + Client.getNom());
//            System.out.println("1. Consulter mes comptes");
//            System.out.println("2. Effectuer un dépôt");
//            System.out.println("3. Effectuer un retrait");
//            System.out.println("4. Effectuer un virement");
//            System.out.println("5. Consulter un relevé bancaire");
//            System.out.println("6. Se déconnecter");
//            System.out.print("Votre choix: ");
//        }
//
//
//
//
//        Scanner sc = new Scanner(System.in);
//
//        int i = 1;
//        switch (i){
//        case 1:
//
//
//        }


    }
}
