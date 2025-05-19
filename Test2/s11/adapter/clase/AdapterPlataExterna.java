package s11.adapter.clase;

public class AdapterPlataExterna implements ProcesarePlata{

    private String currency;

    public AdapterPlataExterna(String currency) {
        this.currency = currency;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Ai platit " + suma + ' ' + currency + '!');
    }
}
