package Singleton.LazyInitialization.Clase;

public class Laptop {
    private static Laptop instance;
    String denumire;
    int anFabricatie;
    double capacitate;

    private Laptop() {
        this.denumire = "laptop";
        this.anFabricatie = 0;
        this.capacitate = 0;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        this.capacitate = capacitate;
    }

    public static Laptop getInstance() {
        if (instance == null) {
            instance = new Laptop();
        }
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
