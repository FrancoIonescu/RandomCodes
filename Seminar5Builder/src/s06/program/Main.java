package s06.program;

import s06.clase.Senzor;
import s06.clase.SenzorBuilder;

public class Main {
    public static void main(String[] args) {
        SenzorBuilder builder = new SenzorBuilder();
        Senzor senzor1 = builder.setActivatCO(true).setActivatCO2(true).setActivatPM10(false).build();
        System.out.println(senzor1);

        Senzor senzor2 = builder.setActivatCO(true).build();
        System.out.println(senzor2);
    }
}

// Prototype fara factory
// Prototype factory lazy
// Prototype factory eager
// La ID s-a dat Prototype Factory lazy Pb1. de la Exercitii_S6