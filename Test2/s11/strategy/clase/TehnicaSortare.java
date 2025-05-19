package s11.strategy.clase;

import s11.chain.clase.AbstractVizitaMagazin;
import s11.chain.clase.Magazin;

import java.util.List;

public class TehnicaSortare {
    AbstractVizitaMagazin vizita1;
    AbstractVizitaMagazin vizita2;
    AbstractVizitaMagazin vizita3;

    public TehnicaSortare(AbstractVizitaMagazin vizita1, AbstractVizitaMagazin vizita2, AbstractVizitaMagazin vizita3) {
        this.vizita1 = vizita1;
        this.vizita2 = vizita2;
        this.vizita3 = vizita3;
    }

    public AbstractVizitaMagazin getVizita1() {
        return vizita1;
    }

    public AbstractVizitaMagazin getVizita2() {
        return vizita2;
    }

    public AbstractVizitaMagazin getVizita3() {
        return vizita3;
    }

    public void lansareProces(List<Magazin> magazine) {
        vizita1.setNextHandler(vizita2);
        vizita2.setNextHandler(vizita3);

        vizita1.sortareMagazine(magazine);
    }
}
