package Singleton.LazyInitialization.Program;

import Singleton.LazyInitialization.Clase.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        laptop.setDenumire("ASUS M509D");
        laptop.setAnFabricatie(2020);
        laptop.setCapacitate(512);

        System.out.println(laptop);
    }
}
