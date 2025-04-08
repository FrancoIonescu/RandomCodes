package Singleton.SingletonRegistry.clase;

public class LaptopLenovo implements ILaptop{
    private int anFabricatie;
    @Override
    public void afiseazaLaptop() {
        System.out.println("Laptopul este Lenovo");
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }
    public int getAnFabricatie() {
        return anFabricatie;
    }
}
