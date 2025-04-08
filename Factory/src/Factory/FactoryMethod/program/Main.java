package Factory.FactoryMethod.program;

import Factory.FactoryMethod.clase.FactoryTelefonIphone11;
import Factory.FactoryMethod.clase.FactoryTelefonS20;
import Factory.FactoryMethod.clase.IFactory;
import Factory.FactoryMethod.clase.ITelefon;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new FactoryTelefonIphone11();
        ITelefon telefon = factory.createTelefon();
        telefon.afisareTelefon();

        IFactory factory1 = new FactoryTelefonS20();
        ITelefon telefon1 = factory1.createTelefon();
        telefon1.afisareTelefon();

    }
}
