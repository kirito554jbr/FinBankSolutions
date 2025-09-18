package Client;

import java.time.LocalDate;




public class Transactions {

    private int compteurId = 1;
    private int idTransaction;
    private TypeTransaction type;
    private double montant;
    private LocalDate date;
    private int CompteSource;
    private int CompteDestination;


    public Transactions(TypeTransaction type, double montant, int compteSource, int compteDestination) {
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

    public int getCompteSource() {
        return CompteSource;
    }

    public int getCompteDestination() {
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
