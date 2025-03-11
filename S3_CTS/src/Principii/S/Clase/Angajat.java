package Principii.S.Clase;

public abstract class Angajat {
    private String nume;
    private int nrOre;
    private boolean areMBA;

    public Angajat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public int getNrOre() {
        return nrOre;
    }

    public boolean isAreMBA() {
        return areMBA;
    }

    public abstract float getSalariu();
}
