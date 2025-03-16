package clase;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CitireStudent implements CitireAplicant {
    @Override
    public List<Aplicant> citesteAplicant(String filePath) throws IOException {
        List<Aplicant> studenti = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length < 7) {
                    continue;
                }


                String nume = tokens[0].trim();
                String prenume = tokens[1].trim();
                int varsta = Integer.parseInt(tokens[2].trim());
                int punctaj = Integer.parseInt(tokens[3].trim());
                int nrProiecte = Integer.parseInt(tokens[4].trim());

                String[] denumiriProiecte = new String[nrProiecte];
                for (int i = 0; i < nrProiecte; i++) {
                    denumiriProiecte[i] = tokens[5 + i].trim();
                }

                int anStudii = Integer.parseInt(tokens[5 + nrProiecte].trim());
                String facultate = tokens[6 + nrProiecte].trim();

                studenti.add(new Student(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte, facultate, anStudii));
            }
        }
        return studenti;
    }
}
