package s11.adapter.program;

import s11.adapter.clase.AdapterPlataExterna;
import s11.adapter.clase.PlataExterna;
import s11.adapter.clase.PlataSimpla;
import s11.adapter.clase.ProcesarePlata;

public class Main {
    public static void main(String[] args) {
        ProcesarePlata plataSimpla = new PlataSimpla();
        plataSimpla.plateste(200);

        PlataExterna plataExterna = new PlataExterna("EUR");
        plataExterna.platesteCurrency(200, "EUR");

        AdapterPlataExterna adapterPlataExterna = new AdapterPlataExterna("RON");
        adapterPlataExterna.plateste(200);
    }
}
