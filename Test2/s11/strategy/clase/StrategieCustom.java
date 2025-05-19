package s11.strategy.clase;

import s11.chain.clase.VizitaLuni;
import s11.chain.clase.VizitaMiercuri;
import s11.chain.clase.VizitaVineri;

public class StrategieCustom implements IStrategy {
    @Override
    public TehnicaSortare generareStrategie() {
        System.out.println("Strategie Custom!");
        return new TehnicaSortare(new VizitaVineri(), new VizitaMiercuri(), new VizitaLuni());
    }
}
