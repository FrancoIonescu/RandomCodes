package s11.clase.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruNote extends FiltruAbstract {
    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        // Medie bac > 6 si medie examen > 5
        List<Candidat> candidatiAdmisiNote = new ArrayList<>();
        for (Candidat candidat : candidati) {
            if (candidat.getMedieBac() > 6 && candidat.getMedieExamen() > 5) {
                candidatiAdmisiNote.add(candidat);
            }
        }
        System.out.println("Dupa filtrare note au ramas " + candidatiAdmisiNote.size() + " candidati!");

        if (nextHandler != null) {
            return nextHandler.filtrare(candidatiAdmisiNote);
        } else {
            System.out.println("S-a terminat filtrarea!");
            return candidatiAdmisiNote;
        }
    }
}
