package Singleton.EagerInitialization.Program;

import Singleton.EagerInitialization.Clase.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        Laptop laptop1 = Laptop.getInstance();

        laptop.setAnFabricatie(2019);

        System.out.println(laptop == laptop1);
    }
}