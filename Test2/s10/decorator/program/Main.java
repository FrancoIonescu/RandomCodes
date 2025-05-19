package s10.decorator.program;

import s10.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        IComanda comanda = new Comanda(1, new Produs(TipProdus.HAINE, "Tricou"));
        comanda.printare();

        IComanda comandaDecorata = new DecoratorCodReducere(comanda);
        comandaDecorata.printare();

    }
}
