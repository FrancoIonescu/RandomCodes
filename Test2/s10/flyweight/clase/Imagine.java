package s10.flyweight.clase;

public class Imagine implements IImagine {
    private String detaliiImagine;
    private TipImagine tipImagine;

    public Imagine(String detaliiImagine, TipImagine tipImagine) {
        this.detaliiImagine = detaliiImagine;
        this.tipImagine = tipImagine;
    }

    @Override
    public void desenare(int x, int y) {
        System.out.println("Denesare " + tipImagine + " la coordonatele " + x + ' ' + y);
        System.out.println("Detalii: " + detaliiImagine);
    }
}
