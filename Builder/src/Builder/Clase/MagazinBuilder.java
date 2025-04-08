package Builder.Clase;

import java.util.List;

public class MagazinBuilder implements IBuilder{

    private String denumire;
    private double suprafata;
    private int nrIntrari;
    private String podeaPersonalizata;
    private double duritatePodea;
    private List<String> decoratiuni;

    public MagazinBuilder() {
        this.denumire = "";
        this.suprafata = 0;
        this.nrIntrari = 1;
        this.podeaPersonalizata = "Podea Standard";
        this.duritatePodea = 0;
        this.decoratiuni = null;
    }

    public MagazinBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    public MagazinBuilder setSuprafata(double suprafata) {
        this.suprafata = suprafata;
        return this;
    }

    public MagazinBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }

    public MagazinBuilder setPodeaPersonalizata(String podeaPersonalizata) {
        this.podeaPersonalizata = podeaPersonalizata;
        return this;
    }

    public MagazinBuilder setDuritatePodea(double duritatePodea) {
        this.duritatePodea = duritatePodea;
        return this;
    }

    public MagazinBuilder setDecoratiuni(List<String> decoratiuni) {
        this.decoratiuni = decoratiuni;
        return this;
    }

    void reset() {
        this.denumire = "";
        this.suprafata = 0;
        this.nrIntrari = 1;
        this.podeaPersonalizata = "Podea Standard";
        this.duritatePodea = 0;
        this.decoratiuni = null;
    }

    @Override
    public Magazin build() {
        Magazin magazin = new Magazin(this.denumire, this.suprafata, this.nrIntrari, this.podeaPersonalizata, this.duritatePodea, this.decoratiuni);
        reset();
        return magazin;
    }
}
