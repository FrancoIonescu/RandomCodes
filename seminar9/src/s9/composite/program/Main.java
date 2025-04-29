package s9.composite.program;

import s9.composite.clase.INod;
import s9.composite.clase.Item;
import s9.composite.clase.NodStructura;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        INod meniu = new NodStructura("Meniu");
        INod nod1 = new NodStructura("Aperitiv");
        INod nod2 = new NodStructura("Desert");
        INod nod3 = new Item("Rulou Cascaval", 150, false);
        INod nod4 = new Item("Friptura", 340, false);
        INod nod5 = new Item("Piure", 120, true);
        INod nod6 = new Item("Tort", 520, true);

        meniu.addNod(nod1);
        meniu.addNod(nod2);
        nod1.addNod(nod3);
        nod1.addNod(nod4);
        nod1.addNod(nod5);
        nod2.addNod(nod6);

        System.out.println(meniu.getNumarCalorii());
        System.out.println(meniu.isVegan());

        // DE FACUT DECORATOR
        // Am o pizzerie si fac diverse feluri de pizza
        // Sa se completeze pizza cu diverse decorari (de ex margine cu branza, pizza picanta)
        // Clientul poate sa cara o pizza cu mai multe decorari (de ex sa fie si cu margine cu branza si pizza picanta)
    }
}
