package s11.chain.program;

import s11.chain.clase.*;
import s11.strategy.clase.IStrategy;
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

        AbstractVizitaMagazin vizita1 = new VizitaLuni();
        AbstractVizitaMagazin vizita2 = new VizitaMiercuri();
        AbstractVizitaMagazin vizita3 = new VizitaVineri();

        vizita1.setNextHandler(vizita2);
        vizita2.setNextHandler(vizita3);

        vizita1.sortareMagazine(magazine);
    }
}
