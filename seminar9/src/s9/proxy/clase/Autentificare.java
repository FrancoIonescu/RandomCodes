package s9.proxy.clase;

public class Autentificare implements IAutentificare {

    @Override
    public boolean autentificare(String username, String password) {
        return username.equals(password);
    }
}
