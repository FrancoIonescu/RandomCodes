package Singleton.EagerInitialization.Clase;

public class Laptop {

    private static final Laptop instance = new Laptop();

    String denumire;
    int anFabricatie;
    double capacitate;

    private Laptop() {
        this.denumire = "ASUS";
        this.anFabricatie = 2020;
        this.capacitate = 512;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public void setCapacitate(double capacitate) {
        this.capacitate = capacitate;
    }

    public static Laptop getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "denumire='" + denumire + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", capacitate=" + capacitate +
                '}';
    }
}
