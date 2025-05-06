package s10.flyweight.clase;

public class Imagine implements IImagine {

    private String detaliiDesenareImagine;
    private TipImagine tipImagine;

    public Imagine(String detaliiDesenareImagine, TipImagine tipImagine) {
        this.detaliiDesenareImagine = detaliiDesenareImagine;
        this.tipImagine = tipImagine;
    }

    @Override
    public void desenare(int x, int y) {
        System.out.println("Se deseneaza " + tipImagine + " la " + "(" + x + "," + y + ")");
    }
}
