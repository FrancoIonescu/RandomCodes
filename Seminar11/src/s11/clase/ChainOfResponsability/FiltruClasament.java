package s11.clase.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruClasament extends FiltruAbstract {
    // Putem prelua din surse externe (Ex: Singleton) nr de locuri oferite
    // Putem hardcoda (Ex: nr locuri = 100)
    // Putem primi ca parametru info suplimentare precum nr locuri in metoda de filtrare
    private int nrLocuriDisponibile = 2;

    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {

        List<Candidat> candidatiAdmisi = new ArrayList<>();
        for (int i = 0; i < candidati.size(); i++) {
            for (int j = i + 1; j < candidati.size(); j++) {
                if (candidati.get(i).getMedieExamen() < candidati.get(j).getMedieExamen()) {
                    Candidat temp = candidati.get(i);
                    candidati.set(i, candidati.get(j));
                    candidati.set(j, temp);
                }
            }
        }

//        if (nrLocuriDisponibile >= candidati.size()) {
//            candidatiAdmisi = candidati;
//        }

        for (int i = 0; i < nrLocuriDisponibile && i < candidati.size(); i++) {
            candidatiAdmisi.add(i, candidati.get(i));
        }

        System.out.println("Dupa filtrare clasament au ramas " + candidatiAdmisi.size() + " candidati!");

        if (nextHandler != null) {
            return nextHandler.filtrare(candidatiAdmisi);
        } else {
            System.out.println("S-a terminat filtrarea!");
            return candidatiAdmisi;
        }
    }
}
