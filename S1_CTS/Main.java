import java.io.*;
import java.util.*;

public class Main {
    private int[] punctaje;
    private int[] pozitiiAsteptate;

    public static void main(String[] args) {
        String numeFisier = "punctaje.txt";
        Main test = new Main();
        test.procesareFisier(numeFisier);

        System.out.println("Timp de executie: ");
        System.out.println("Citirea fișierului: O(n)");
        System.out.println("Sortarea punctajelor: O(n log n)");
        System.out.println("Calcularea pozitiei unui punctaj: O(n)");
    }

    private void procesareFisier(String fisier) {
        List<Integer> listaPunctaje = new ArrayList<>();
        List<Integer> listaPozitii = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fisier))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                if (linie.trim().isEmpty()) {

                    proceseazaSet(listaPunctaje, listaPozitii);
                    listaPunctaje.clear();
                    listaPozitii.clear();
                    continue;
                }

                String[] valori = linie.split("\\s+");
                if (valori.length == 2) {
                    try {
                        int punctaj = Integer.parseInt(valori[0]);
                        int pozitieAsteptata = Integer.parseInt(valori[1]);
                        listaPunctaje.add(punctaj);
                        listaPozitii.add(pozitieAsteptata);
                    } catch (NumberFormatException e) {
                        System.out.println("Valoare invalida in fisier: " + linie);
                    }
                }
            }

            if (!listaPunctaje.isEmpty()) {
                proceseazaSet(listaPunctaje, listaPozitii);
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierului: " + e.getMessage());
        }
    }

    private void proceseazaSet(List<Integer> listaPunctaje, List<Integer> listaPozitii) {
        listaPunctaje.sort(Comparator.reverseOrder());

        punctaje = listaPunctaje.stream().mapToInt(i -> i).toArray();
        pozitiiAsteptate = listaPozitii.stream().mapToInt(i -> i).toArray();

        System.out.println("\nProcesare set nou...");
        teste();
    }

    public int getPozitie(int pct) {
        if (punctaje == null || punctaje.length == 0) {
            System.out.println("Nu exista date disponibile.");
            return -1;
        }

        List<Integer> punctajeUnice = new ArrayList<>();
        for (int i = 0; i < punctaje.length; i++) {
            if (i == 0 || punctaje[i] != punctaje[i - 1]) {
                punctajeUnice.add(punctaje[i]);
            }
        }

        int pozitie = punctajeUnice.indexOf(pct);
        return (pozitie != -1) ? pozitie + 1 : -1;
    }

    public void teste() {
        if (punctaje == null || pozitiiAsteptate == null) {
            System.out.println("Nu s-au citit date din fișier.");
            return;
        }

        int totalTeste = 0, testeReusite = 0;

        for (int i = 0; i < punctaje.length; i++) {
            int punctaj = punctaje[i];
            int pozitieAsteptata = pozitiiAsteptate[i];
            int pozitieCalculata = getPozitie(punctaj);

            if (punctaj < 0) {
                System.out.println("❌ Punctaj negativ detectat: " + punctaj);
                totalTeste++;
                continue;
            }

            totalTeste++;
            if (pozitieCalculata == pozitieAsteptata) {
                System.out.println("✅ Test reusit pentru " + punctaj + ": " + pozitieCalculata);
                testeReusite++;
            } else {
                System.out.println("❌ Test esuat pentru " + punctaj + ": Asteptat " + pozitieAsteptata + ", dar obtinut " + pozitieCalculata);
            }
        }

        System.out.println("\n✅ " + testeReusite + "/" + totalTeste + " teste reusite.\n");
    }
}
