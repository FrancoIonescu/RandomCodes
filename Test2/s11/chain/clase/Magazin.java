package s11.chain.clase;

public class Magazin {
    String denumire;
    String produs;

    public Magazin(String denumire, String produs) {
        this.denumire = denumire;
        this.produs = produs;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getProdus() {
        return produs;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", produs='" + produs + '\'' +
                '}';
    }
}
