package s9.composite.clase;

public interface INod {
    public float getNumarCalorii();
    public boolean isVegan();
    public void addNod(INod nod);
    public INod getNod(int index);
    public void removeNod(INod nod);
}
