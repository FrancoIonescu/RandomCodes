package s11.strategy.program;

import s11.chain.clase.Magazin;
import s11.strategy.clase.IStrategy;
import s11.strategy.clase.StrategieCustom;
import s11.strategy.clase.StrategieStandard;
import s11.strategy.clase.TehnicaSortare;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Magazin LIDL = new Magazin("LIDL", "hummus");
        Magazin Kaufland = new Magazin("Kaufland", "crispy strips");
        Magazin Auchan = new Magazin("Auchan", "sushi");

        List<Magazin> magazine = new ArrayList<>();
        magazine.add(LIDL);
        magazine.add(Kaufland);
        magazine.add(Auchan);

        IStrategy strategieStandard = new StrategieStandard();
        TehnicaSortare sortareStandard = strategieStandard.generareStrategie();
        sortareStandard.lansareProces(magazine);

        IStrategy strategieCustom = new StrategieCustom();
        TehnicaSortare sortareCustom = strategieCustom.generareStrategie();
        sortareCustom.lansareProces(magazine);
    }
}
