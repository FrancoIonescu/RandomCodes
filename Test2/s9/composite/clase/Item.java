package s9.composite.clase;

public class Item implements INod {
    String numeEchipa;
    int numarJucatori;

    public Item(String numeEchipa, int numarJucatori) {
        this.numeEchipa = numeEchipa;
        this.numarJucatori = numarJucatori;
    }

    @Override
    public int getNumarJucatori() {
        return numarJucatori;
    }

    @Override
    public void afiseazaNumeEchipe() {
        System.out.println("Echipa este: " + numeEchipa);
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Item{" +
                "numeEchipa='" + numeEchipa + '\'' +
                ", numarJucatori=" + numarJucatori +
                '}';
    }
}
