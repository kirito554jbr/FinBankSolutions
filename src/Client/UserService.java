package Client;

public class UserService {

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Compte user;
    private Client client;

    public UserService(String nom,String prenom,String email,String motDePasse) {
        this.client = new Client(nom, prenom, email, motDePasse);
    }

//    public UserService(String nom, String prenom, String email, String password, Client.Compte user, Client.Client client) {
//        this.nom = nom;
//        this.prenom = prenom;
//        this.email = email;
//        this.password = password;
//        this.user = user;
//        this.client = client;
//    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void ajouterCompte(){
        this.user = new Compte();
        this.client.ajouterCompte(this.user);
        System.out.println(this.client.getComptes());
        System.out.println(this.client);
    }

    public void supprimerCompte(int numeroCompte){
        this.client.supprimerCompte(numeroCompte);
        System.out.println("***********");
    }
}
