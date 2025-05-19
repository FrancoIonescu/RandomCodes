package s9.composite.clase;

public interface INod {
    int getNumarJucatori();
    void afiseazaNumeEchipe();
    INod getNod(int index);
    void addNod(INod nod);
    void removeNod(INod nod);
}
