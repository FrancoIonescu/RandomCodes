package s9.template.clase;

import java.util.Scanner;

public class ProcesInterviuIT extends AProcesInterviu {
    @Override
    void desfasurareInterviu() {
        int scor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Intrebarea 1: Care dintre urmatoarele este un limbaj de programare?");
        System.out.println("A) HTML");
        System.out.println("B) Google Chrome");
        System.out.println("C) Python");
        System.out.println("D) Wi-Fi");
        System.out.print("Raspunsul tau: ");
        String raspuns1 = scanner.nextLine();
        if (raspuns1.equalsIgnoreCase("C")) {
            scor++;
        }

        System.out.println("\nIntrebarea 2: Ce este un algoritm?");
        System.out.println("A) O aplicatie instalata pe calculator");
        System.out.println("B) Un set de instructiuni pentru rezolvarea unei probleme");
        System.out.println("C) O retea de calculatoare");
        System.out.println("D) Un tip de virus informatic");
        System.out.print("Raspunsul tau: ");
        String raspuns2 = scanner.nextLine();
        if (raspuns2.equalsIgnoreCase("B")) {
            scor++;
        }

        System.out.println("\nIntrebarea 3: Ce extensie are de obicei un fisier executabil in Windows?");
        System.out.println("A) .txt");
        System.out.println("B) .exe");
        System.out.println("C) .jpg");
        System.out.println("D) .pdf");
        System.out.print("Raspunsul tau: ");
        String raspuns3 = scanner.nextLine();
        if (raspuns3.equalsIgnoreCase("B")) {
            scor++;
        }

        System.out.println("\nIntrebarea 4: Care este unitatea principala de masura a capacitatii de stocare?");
        System.out.println("A) Volt");
        System.out.println("B) Punct");
        System.out.println("C) Bit");
        System.out.println("D) Pixel");
        System.out.print("Raspunsul tau: ");
        String raspuns4 = scanner.nextLine();
        if (raspuns4.equalsIgnoreCase("C")) {
            scor++;
        }

        System.out.println("\nIntrebarea 5: Ce functie are tastatura intr-un calculator?");
        System.out.println("A) Afiseaza imagini");
        System.out.println("B) Trimite semnal sonor");
        System.out.println("C) Introduce date");
        System.out.println("D) Imprima documente");
        System.out.print("Raspunsul tau: ");
        String raspuns5 = scanner.nextLine();
        if (raspuns5.equalsIgnoreCase("C")) {
            scor++;
        }

        System.out.println("\nScorul tau final este: " + scor + " / 5");
        if (scor > 3) {
            admis = true;
        }
    }

}
