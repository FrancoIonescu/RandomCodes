package s9.proxy.clase;

import java.util.HashMap;
import java.util.Map;

public class AutentificareProxy implements IAutentificare {
    Autentificare autentificare;
    Map<String, Integer> nrAutentificari;

    public AutentificareProxy(Autentificare autentificare) {
        this.autentificare = autentificare;
        this.nrAutentificari = new HashMap<>();
    }

    @Override
    public boolean autentificare(String nume, String parola) {
        if (!autentificare.autentificare(nume, parola)) {
            if (!nrAutentificari.containsKey(nume)) {
                nrAutentificari.put(nume, 1);
            }

            if (nrAutentificari.get(nume) > 3) {
                System.out.println("TIMEOUT");
                return false;
            }

            System.out.println("Parola gresita!");
            nrAutentificari.put(nume, nrAutentificari.get(nume) + 1);
            return false;
        }
        System.out.println("Utilizator conectat cu succes");
        return true;
    }
}
