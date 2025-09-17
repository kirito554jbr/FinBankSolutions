package Client;

import java.time.LocalDate;

public class Transactions {

    private int idTransaction;
    private String type;
    private float montant;
    private LocalDate date;
    private String CompteSource;
    private String CompteDestination;

    public int getIdTransaction() {
        return idTransaction;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

//    public void setDate(String date) {
//        this.date = date;
//    }

    public String getCompteSource() {
        return CompteSource;
    }

    public void setCompteSource(String compteSource) {
        CompteSource = compteSource;
    }

    public String getCompteDestination() {
        return CompteDestination;
    }

    public void setCompteDestination(String compteDestination) {
        CompteDestination = compteDestination;
    }
}
