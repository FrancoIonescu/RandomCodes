import java.util.Queue;
import java.util.LinkedList;

class Stoc {
    private final Queue<Ingredient> stocFIFO = new LinkedList<>();

    public synchronized void adaugaIngredient(String nume, int cantitate) {
        stocFIFO.add(new Ingredient(nume, cantitate));
    }

    public synchronized boolean consumaIngredient(String nume, int cantitateNecesar) {
        int totalDisponibil = stocFIFO.stream()
                .filter(i -> i.nume.equals(nume))
                .mapToInt(i -> i.cantitate)
                .sum();

        if (totalDisponibil < cantitateNecesar) {
            return false;
        }

        Queue<Ingredient> tempQueue = new LinkedList<>();

        while (cantitateNecesar > 0 && !stocFIFO.isEmpty()) {
            Ingredient i = stocFIFO.poll(); // Scoatem primul ingredient din coadă

            if (!i.nume.equals(nume)) {
                tempQueue.add(i); // Dacă nu e ingredientul căutat, îl păstrăm
                continue;
            }

            if (i.cantitate <= cantitateNecesar) {
                cantitateNecesar -= i.cantitate; // Consuma toată cantitatea
            } else {
                i.cantitate -= cantitateNecesar; // Scade doar cât e nevoie
                cantitateNecesar = 0;
                tempQueue.add(i); // Reintroducem ingredientul rămas
            }
        }

        // Adăugăm înapoi ingredientele neconsumate
        stocFIFO.addAll(tempQueue);
        return true;
    }

    public synchronized void afiseazaStoc() {
        System.out.println("Stoc curent:");
        for (Ingredient i : stocFIFO) {
            System.out.println(i.nume + " - " + i.cantitate);
        }
    }
}
