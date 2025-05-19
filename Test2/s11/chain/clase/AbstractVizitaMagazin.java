package s11.chain.clase;

import java.util.List;

public abstract class AbstractVizitaMagazin {
    AbstractVizitaMagazin nextHandler;

    public void setNextHandler(AbstractVizitaMagazin nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract List<Magazin> sortareMagazine(List<Magazin> magazine);
}
