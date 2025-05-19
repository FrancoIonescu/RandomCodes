package s10.decorator.clase;

public abstract class AbstractDecorator implements IComanda {
    protected IComanda comanda;

    public AbstractDecorator(IComanda comanda) {
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
