package Builder.Clase;

import java.util.List;

public class Magazin {
    private String denumire;
    private double suprafata;
    private int nrIntrari;
    private String podeaPersonalizata;
    private double duritatePodea;
    private List<String> decoratiuni;

    Magazin(String denumire, double suprafata, int nrIntrari, String podeaPersonalizata, double duritatePodea, List<String> decoratiuni) {
        super();
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.podeaPersonalizata = podeaPersonalizata;
        this.duritatePodea = duritatePodea;
        this.decoratiuni = decoratiuni;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", podeaPersonalizata='" + podeaPersonalizata + '\'' +
                ", duritatePodea=" + duritatePodea +
                ", decoratiuni=" + decoratiuni +
                '}';
    }
}
