package s9.proxy.program;

import s9.proxy.clase.Autentificare;
import s9.proxy.clase.AutentificareProxy;
import s9.proxy.clase.IAutentificare;

public class Main {
    public static void main(String[] args) {
        IAutentificare autentificareProxy = new AutentificareProxy(new Autentificare());
        autentificareProxy.autentificare("franco", "Franco");
        autentificareProxy.autentificare("franco", "Franco");
        autentificareProxy.autentificare("franco", "Franco");
        autentificareProxy.autentificare("franco", "Franco");
        autentificareProxy.autentificare("franco", "Franco");
    }
}
