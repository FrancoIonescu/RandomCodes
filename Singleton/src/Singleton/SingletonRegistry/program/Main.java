package Singleton.SingletonRegistry.program;

import Singleton.SingletonRegistry.clase.*;

public class Main {
    public static void main(String[] args) {
        LaptopAsus laptopAsus = new LaptopAsus();
        laptopAsus.setAnFabricatie(2023);
        LaptopAsus laptopAsus1 = new LaptopAsus();
        laptopAsus1.setAnFabricatie(2025);
        LaptopHP laptopHP = new LaptopHP();
        LaptopLenovo laptopLenovo = new LaptopLenovo();

        try {
            LaptopRegistry.register("asus", laptopAsus);
            LaptopRegistry.register("hp", laptopHP);
            LaptopRegistry.register("lenovo", laptopLenovo);

            LaptopAsus laptopAsusCopie = (LaptopAsus) LaptopRegistry.getLaptop("asus");
            System.out.println(laptopAsusCopie.getAnFabricatie());
            laptopAsusCopie.setAnFabricatie(2025);
            System.out.println(laptopAsusCopie.getAnFabricatie());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
