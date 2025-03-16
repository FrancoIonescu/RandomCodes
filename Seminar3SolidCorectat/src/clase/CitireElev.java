package clase;

import java.io.*;
import java.util.*;

public class CitireElev implements CitireAplicant {
    @Override
    public List<Aplicant> citesteAplicant(String filePath) throws IOException {
        List<Aplicant> elevi = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String linie;

        while ((linie = reader.readLine()) != null) {
            String[] valori = linie.split(",");

            String nume = valori[0];
            String prenume = valori[1];
            int varsta = Integer.parseInt(valori[2]);
            int punctaj = Integer.parseInt(valori[3]);
            int nrProiecte = Integer.parseInt(valori[4]);

            String[] denumiriProiecte = new String[nrProiecte];
            for (int i = 0; i < nrProiecte; i++) {
                denumiriProiecte[i] = valori[5 + i];
            }

            int clasa = Integer.parseInt(valori[5 + nrProiecte]);
            String tutore = valori[6 + nrProiecte];

            Elev elev = new Elev(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte, clasa, tutore);
            elevi.add(elev);
        }
        reader.close();
        return elevi;
    }
}
