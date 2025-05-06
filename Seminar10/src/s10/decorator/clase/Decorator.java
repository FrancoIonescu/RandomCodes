package s10.decorator.clase;

abstract class Decorator implements IComanda {
    IComanda comanda;

    public Decorator(IComanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public void printare() {
        comanda.printare();
    }

    @Override
    public Produs getProdus() {
        return comanda.getProdus();
    }
}
