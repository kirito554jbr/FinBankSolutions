package Client;

import java.time.LocalDate;




public class Transactions {

    private int compteurId = 1;
    private int idTransaction;
    private TypeTransaction type;
    private double montant;
    private LocalDate date;
    private String CompteSource;
    private String CompteDestination;


    public Transactions(TypeTransaction type, double montant, String compteSource, String compteDestination) {
        this.idTransaction = compteurId++;
        this.type = type;
        this.montant = montant;
        this.date = LocalDate.now();
        this.CompteSource = compteSource;
        this.CompteDestination = compteDestination;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public TypeTransaction getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCompteSource() {
        return CompteSource;
    }

    public String getCompteDestination() {
        return CompteDestination;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "compteurId=" + compteurId +
                ", idTransaction=" + idTransaction +
                ", type=" + type +
                ", montant=" + montant +
                ", date=" + date +
                ", CompteSource='" + CompteSource + '\'' +
                ", CompteDestination='" + CompteDestination + '\'' +
                '}';
    }
}
