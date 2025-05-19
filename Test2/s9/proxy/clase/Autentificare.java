package s9.proxy.clase;

public class Autentificare implements IAutentificare {
    @Override
    public boolean autentificare(String nume, String parola) {
        if (nume.toLowerCase().equals("franco") && parola.equals("franco")) {
            return true;
        }
        else {
            return false;
        }
    }
}
