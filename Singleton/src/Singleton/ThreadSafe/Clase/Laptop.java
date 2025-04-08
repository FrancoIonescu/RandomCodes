package Singleton.ThreadSafe.Clase;

public class Laptop {
    private static volatile Laptop instance;

    String denumire;
    int anFabricatie;
    double capacitate;

    private Laptop() throws LaptopException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new LaptopException("Firul de executie este ocupat!");
        }
        this.denumire = "Laptop";
        this.anFabricatie = 0;
        this.capacitate = 0;
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

    public static synchronized Laptop getInstance() {
        if (instance == null) {
            try {
                instance = new Laptop();
            } catch (LaptopException e) {
                System.out.println(e.getMessage());
            }
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
