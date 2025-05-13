package s11.clase.ChainOfResponsability;

public class Candidat {
    String nume;
    String eseu;
    double medieBac;
    double medieExamen;

    public Candidat(String nume, String eseu, double medieBac, double medieExamen) {
        this.nume = nume;
        this.eseu = eseu;
        this.medieBac = medieBac;
        this.medieExamen = medieExamen;
    }

    public String getNume() {
        return nume;
    }

    public String getEseu() {
        return eseu;
    }

    public double getMedieBac() {
        return medieBac;
    }

    public double getMedieExamen() {
        return medieExamen;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nume='" + nume + '\'' +
                ", eseu='" + eseu + '\'' +
                ", medieBac=" + medieBac +
                ", medieExamen=" + medieExamen +
                '}';
    }
}
