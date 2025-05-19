package s11.adapter.clase;

public class PlataSimpla implements ProcesarePlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Ai" +
                " platit " + suma + " lei!");
    }
}
