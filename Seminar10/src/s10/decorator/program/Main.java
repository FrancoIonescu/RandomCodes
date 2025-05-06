package s10.decorator.program;

import s10.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        // inainte de decorare
        IComanda comanda = new Comanda(1, new Produs(TipProdus.ELECTRO_MARE, "Frigider Samsung"));
        comanda.printare();

        // dupa decorare
        IComanda comandaDecorata = new DecoratorCodReducere(comanda);
        comandaDecorata.printare();
    }
}
