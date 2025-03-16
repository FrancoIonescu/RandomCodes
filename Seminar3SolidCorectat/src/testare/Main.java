package testare;

import clase.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final StatutAplicant statutAplicant = new StatutAplicant();
    private static final CalculatorFinantare calculatorFinantare = new CalculatorFinantare();

    public static void main(String[] args) {

        try {
            CitireAplicant citireElevi = new CitireElev();
            List<Aplicant> listaElevi = citireElevi.citesteAplicant("elevi.txt");
            afisareInformatiiAplicant(listaElevi, 30);

            CitireAplicant citireStudenti = new CitireStudent();
            List<Aplicant> listaStudenti = citireStudenti.citesteAplicant("studenti.txt");
            afisareInformatiiAplicant(listaStudenti, 20);

            CitireAplicant citireAngajati = new CitireAngajat();
            List<Aplicant> listaAngajati = citireAngajati.citesteAplicant("angajati.txt");
            afisareInformatiiAplicant(listaAngajati, 10);

            System.out.println("Afisarea tuturor aplicantilor: ");
            List<List<Aplicant>> listaAplicanti = new ArrayList<>();
            listaAplicanti.add(listaElevi);
            listaAplicanti.add(listaStudenti);
            listaAplicanti.add(listaAngajati);
            AfisareAplicanti.afisareAplicanti(listaAplicanti);

        } catch (IOException e) {
            throw new RuntimeException("Eroare la citirea fisierlor de aplicanti: " + e.getMessage());
        }
    }

    public static void afisareInformatiiAplicant(List<Aplicant> aplicanti, int s) {
        for (Aplicant aplicant: aplicanti) {
            System.out.println(aplicant.toString());
            statutAplicant.verificaStatut(aplicant);
            calculatorFinantare.calculeazaFinantare(aplicant, s);
            System.out.println();
        }
    }
}
