package s10.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<TipImagine, IImagine> mapa;

    // Initializare eager
    static {
        mapa = new HashMap<>();
        mapa.put(TipImagine.CERC, new Imagine("Detalii cerc", TipImagine.CERC));
        mapa.put(TipImagine.PATRAT, new Imagine("Detalii patrat", TipImagine.PATRAT));
        mapa.put(TipImagine.TRIUNGHI, new Imagine("Detalii triunghi", TipImagine.TRIUNGHI));
    }

    public static IImagine getImagine(TipImagine tipImagine) {
        // presupunem ca nu extindem enumeratia si ne limitam la cele initiale
        return mapa.getOrDefault(tipImagine, null);
    }
}
