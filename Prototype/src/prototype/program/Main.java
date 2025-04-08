package prototype.program;

import prototype.clase.AJucator;
import prototype.clase.PrototypeFactory;

public class Main {
    public static void main(String[] args) {

        AJucator fotbalist = PrototypeFactory.getPrototipJucator("fotbalist");
        fotbalist.afisareDetalii();
        fotbalist.setNumeJucator("Mihai Georgian");

        fotbalist.adaugareMedicamentInterzis("Nurofen++");

        AJucator fotbalist1 = PrototypeFactory.getPrototipJucator("fotbalist");
        fotbalist1.afisareDetalii();

        fotbalist.stergeMedicamentInterzis("Nurofen++");

        fotbalist.setPozitieJucator("Atacant");
        System.out.println(fotbalist.getPozitieJucator());

        AJucator baschetbalist = PrototypeFactory.getPrototipJucator("baschetbalist");
        baschetbalist.afisareDetalii();
        baschetbalist.setNumeJucator("Marius Ene");

    }
}