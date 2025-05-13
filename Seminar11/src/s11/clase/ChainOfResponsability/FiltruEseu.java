package s11.clase.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruEseu extends FiltruAbstract {
    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        // Se considera eseul corect daca are o lungime impara
        List<Candidat> candidatiAdmisiEseu = new ArrayList<>();
        for (Candidat candidat : candidati) {
            if (candidat.getEseu().length() % 2 != 0) {
                candidatiAdmisiEseu.add(candidat);
            }
        }
        System.out.println("Dupa filtrare eseu au ramas " + candidatiAdmisiEseu.size() + " candidati!");

        if (nextHandler != null) {
            return nextHandler.filtrare(candidatiAdmisiEseu);
        } else {
            System.out.println("S-a terminat filtrarea!");
            return candidatiAdmisiEseu;
        }
    }
}
