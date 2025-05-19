package s10.decorator.clase;

public class Produs {
    private TipProdus tipProdus;
    private String denumireProdus;

    public Produs(TipProdus tipProdus, String denumireProdus) {
        this.tipProdus = tipProdus;
        this.denumireProdus = denumireProdus;
    }

    public TipProdus getTipProdus() {
        return tipProdus;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "tipProdus=" + tipProdus +
                ", denumireProdus='" + denumireProdus + '\'' +
                '}';
    }
}
