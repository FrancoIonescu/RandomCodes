package s11.strategy.clase;

import s11.chain.clase.VizitaLuni;
import s11.chain.clase.VizitaMiercuri;
import s11.chain.clase.VizitaVineri;

public class StrategieStandard implements IStrategy {
    @Override
    public TehnicaSortare generareStrategie() {
        return new TehnicaSortare(new VizitaLuni(), new VizitaMiercuri(), new VizitaVineri());
    }
}
