package s11.program;

import s11.clase.ChainOfResponsability.*;
import s11.clase.Facade.Admitere;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candidat candidat1 = new Candidat("Andrei", "1", 7,6);
        Candidat candidat2 = new Candidat("Andrei", "2", 7,6);
        Candidat candidat3 = new Candidat("Andrei", "1", 7,6);
        Candidat candidat4 = new Candidat("Andrei", "1", 7,6);
        Candidat candidat5 = new Candidat("Andrei", "1", 7,6);
        Candidat candidat6 = new Candidat("Andrei", "1", 7,6);
        Candidat candidat7 = new Candidat("Andrei", "1", 7,6);
        Candidat candidat8 = new Candidat("Andrei", "11", 7,6);

        List<Candidat> candidati = new ArrayList<>();
        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);
        candidati.add(candidat4);
        candidati.add(candidat5);
        candidati.add(candidat6);
        candidati.add(candidat7);
        candidati.add(candidat8);

        // Adaugare responsabili concreti
//        FiltruAbstract filtruEseu = new FiltruEseu();
//        FiltruAbstract filtruNote = new FiltruNote();
//        FiltruAbstract filtruClasament = new FiltruClasament();

        // Creare lant de responsabili
//        filtruEseu.setNextHandler(filtruNote);
//        filtruNote.setNextHandler(filtruClasament);

        // Lansare cerere in lant catre primul responsabil
//        System.out.println(filtruEseu.filtrare(candidati));

        Admitere admitere = new Admitere(new FiltruEseu(), new FiltruNote(), new FiltruClasament());
        admitere.adaugaCandidat(candidat1);
        admitere.adaugaCandidat(candidat2);
        admitere.adaugaCandidat(candidat3);
        admitere.adaugaCandidat(candidat4);
        admitere.adaugaCandidat(candidat5);
        admitere.adaugaCandidat(candidat6);
        admitere.adaugaCandidat(candidat7);
        admitere.adaugaCandidat(candidat8);

        admitere.lansareProcesAdmitere();
    }
}
