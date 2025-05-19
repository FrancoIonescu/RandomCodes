package s9.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod {
    String denumireLiga;
    List<INod> listaEchipe;

    public NodStructura(String denumireLiga) {
        this.denumireLiga = denumireLiga;
        this.listaEchipe = new ArrayList<>();
    }

    @Override
    public int getNumarJucatori() {
        int nrJucatori = 0;
        for (INod echipa: listaEchipe) {
            nrJucatori += echipa.getNumarJucatori();
        }
        return nrJucatori;
    }

    @Override
    public void afiseazaNumeEchipe() {
        for (INod echipa: listaEchipe) {
            echipa.afiseazaNumeEchipe();
        }
    }

    @Override
    public INod getNod(int index) {
        return listaEchipe.get(index);
    }

    @Override
    public void addNod(INod nod) {
        listaEchipe.add(nod);
    }

    @Override
    public void removeNod(INod nod) {
        listaEchipe.remove(nod);
    }
}
