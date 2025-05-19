package s11.adapter.clase;

public class PlataExterna {
    String currency;

    public PlataExterna(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void platesteCurrency(double suma, String currency) {
        System.out.println("Ai platit " + suma + ' ' + currency + '!');
    }
}
