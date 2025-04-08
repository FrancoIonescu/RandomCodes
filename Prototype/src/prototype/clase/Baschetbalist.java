package prototype.clase;

import java.util.ArrayList;

public class Baschetbalist extends AJucator{
    Baschetbalist() {
        this.sportPracticat = "Baschet";
        this.medicamenteInterzise = new ArrayList<>();
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
    }
}
