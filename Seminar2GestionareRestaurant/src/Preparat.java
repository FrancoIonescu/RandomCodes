import java.util.HashMap;
import java.util.Map;

class Preparat {
    String nume;
    Map<String, Integer> ingredienteNecesare;

    public Preparat(String nume) {
        this.nume = nume;
        this.ingredienteNecesare = new HashMap<>();
    }

    public void adaugaIngredient(Ingredient ingredient) {
        ingredienteNecesare.put(ingredient.nume, ingredient.cantitate);
    }
}
