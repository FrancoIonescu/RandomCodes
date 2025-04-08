package Singleton.ThreadSafe.Program;

import Singleton.ThreadSafe.Clase.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        laptop.setDenumire("ASUS M509D");
        laptop.setAnFabricatie(2020);
        laptop.setCapacitate(512);

        Laptop laptop1 = Laptop.getInstance();
        System.out.println(laptop);
        System.out.println(laptop1);

    }
}
