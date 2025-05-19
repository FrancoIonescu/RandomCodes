package s10.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<TipImagine, IImagine> tipImagini;

    static {
        tipImagini = new HashMap<>();
        tipImagini.put(TipImagine.CERC, new Imagine("CERC", TipImagine.CERC));
        tipImagini.put(TipImagine.PATRAT, new Imagine("PATRAT", TipImagine.PATRAT));
        tipImagini.put(TipImagine.TRIUNGHI, new Imagine("TRIUNGHI", TipImagine.TRIUNGHI));
    }

    public static IImagine getImagine(TipImagine tipImagine) {
        return tipImagini.getOrDefault(tipImagine, null);
    }
}
