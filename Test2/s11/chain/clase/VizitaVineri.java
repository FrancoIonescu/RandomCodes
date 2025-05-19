package s11.chain.clase;

import java.util.ArrayList;
import java.util.List;

public class VizitaVineri extends AbstractVizitaMagazin {
    @Override
    public List<Magazin> sortareMagazine(List<Magazin> magazine) {
        List<Magazin> magazineSortate = new ArrayList<>();
        magazineSortate.add(magazine.get(2));
        System.out.println("Sushi");
        magazineSortate.add(magazine.get(0));
        System.out.println("Hummus");
        magazineSortate.add(magazine.get(1));
        System.out.println("Crispy Strips");

        if (nextHandler != null) {
            nextHandler.sortareMagazine(magazineSortate);
        }

        return magazineSortate;
    }
}
