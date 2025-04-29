package s9.composite.clase;

public class Item implements INod {
    private String denumire;
    private float numarCalorii;
    private boolean isVegan;

    public Item(String denumire, float numarCalorii, boolean isVegan) {
        this.denumire = denumire;
        this.numarCalorii = numarCalorii;
        this.isVegan = isVegan;
    }

    @Override
    public float getNumarCalorii() {
        return numarCalorii;
    }

    @Override
    public boolean isVegan() {
        return isVegan;
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException();
    }
}
