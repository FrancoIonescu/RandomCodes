package prototype.clase;

import java.util.ArrayList;

public class Fotbalist extends AJucator{

    Fotbalist() {
        this.sportPracticat = "fotbal";
        this.medicamenteInterzise = new ArrayList<>();
        this.medicamenteInterzise.add("Paracetamol");
        this.medicamenteInterzise.add("Nurofen");
        this.medicamenteInterzise.add("Aspirina");
        this.medicamenteInterzise.add("Algocalmin");
    }

    @Override
    public void adaugareMedicamentInterzis(String medicamentInterzis) {
        this.medicamenteInterzise.add(medicamentInterzis);
    }

    @Override
    public void stergeMedicamentInterzis(String medicamentInterzis) {
        this.medicamenteInterzise.remove(medicamentInterzis);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Sport practicat: " + this.sportPracticat);
        System.out.println("Medicamente interzise: " + this.medicamenteInterzise);
    }
}
