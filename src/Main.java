import Client.*;


public class Main {
    public static void main(String[] args) {


        UserService user =  new UserService("aymen","jebrane","ay5jbr2023@gmsil.com","0000");
        UserService user2 =  new UserService("anouar","sorror","anouar.sorrour@gmsil.com","0000");

//        UserService user =  new UserService();

        user.ajouterCompte();
        user2.ajouterCompte();
        user.supprimerCompte(5555);



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
