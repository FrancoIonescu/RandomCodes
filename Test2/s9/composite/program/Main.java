package s9.composite.program;

import s9.composite.clase.INod;
import s9.composite.clase.Item;
import s9.composite.clase.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod superliga = new NodStructura("Superliga");
        INod fcsb = new Item("FCSB", 15);
        INod dinamo = new Item("Dinamo", 15);
        INod rapid = new Item("Rapid", 13);

        superliga.addNod(fcsb);
        superliga.addNod(dinamo);
        superliga.addNod(rapid);

        superliga.afiseazaNumeEchipe();
        int nrJucatori = superliga.getNumarJucatori();
        System.out.println(nrJucatori);
    }
}
