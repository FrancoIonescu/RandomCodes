import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Comanda {
    List<Preparat> preparate;
    String status;

    public Comanda(Preparat preparat) {
        this.preparate = new ArrayList<>();
        this.preparate.add(preparat);
        this.status = "Nouă";
    }
    public Comanda(List<Preparat> preparate) {
        this.preparate = preparate;
        this.status = "Nouă";
    }

    public void proceseaza(Stoc stoc) {
        boolean poateFiProcesata = true;
        for (Preparat p : preparate) {
            for (Map.Entry<String, Integer> entry : p.ingredienteNecesare.entrySet()) {
                if (!stoc.consumaIngredient(entry.getKey(), entry.getValue())) {
                    poateFiProcesata = false;
                    break;
                }
            }
            if (!poateFiProcesata) break;
        }

        if (poateFiProcesata) {
            status = "Acceptată";
            System.out.println("Comanda a fost acceptată.");
        } else {
            status = "Anulată";
            System.out.println("Comanda a fost anulată din lipsă de stoc.");
        }
    }
}
