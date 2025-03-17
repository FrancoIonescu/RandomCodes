import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stoc stoc = new Stoc();
        stoc.adaugaIngredient("Cartofi", 15);
        stoc.adaugaIngredient("Carne", 10);
        stoc.adaugaIngredient("Oua", 8);
        stoc.adaugaIngredient("Apa", 10);

        Preparat omleta = new Preparat("Omletă");
        omleta.adaugaIngredient(new Ingredient("Oua", 3));
        omleta.adaugaIngredient(new Ingredient("Cartofi", 2));

        Preparat friptura = new Preparat("Friptură");
        friptura.adaugaIngredient(new Ingredient("Carne", 3));
        friptura.adaugaIngredient(new Ingredient("Cartofi", 4));

        Preparat musaca = new Preparat("Musaca");
        musaca.adaugaIngredient(new Ingredient("Carne", 2));
        musaca.adaugaIngredient(new Ingredient("Cartofi", 4));
        musaca.adaugaIngredient(new Ingredient("Oua", 3));

        Preparat apa = new Preparat("Apa");
        apa.adaugaIngredient(new Ingredient("Apa", 2));

        Comanda comanda1 = new Comanda(Arrays.asList(omleta, friptura, musaca));
        comanda1.proceseaza(stoc);

        Comanda comanda2 = new Comanda(apa);
        comanda2.proceseaza(stoc);

        stoc.afiseazaStoc();
    }
}