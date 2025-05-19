package s10.decorator.clase;

public class DecoratorCodReducere extends AbstractDecorator {

    private static int contor = 100;
    public DecoratorCodReducere(IComanda comanda) {
        super(comanda);
    }

    @Override
    public void printare() {
        super.printare();
        System.out.println("COD REDUCERE: " + contor + "XYZ");
        contor++;
    }
}
