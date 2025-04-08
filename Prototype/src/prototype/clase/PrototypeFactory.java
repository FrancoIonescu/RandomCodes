package prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static final Map<String, AJucator> prototipuriJucatori = new HashMap<>();

    static {
        Fotbalist fotbalist = new Fotbalist();
        prototipuriJucatori.put("fotbalist", fotbalist);

        Baschetbalist baschetbalist = new Baschetbalist();
        prototipuriJucatori.put("baschetbalist", baschetbalist);
    }

    public static AJucator getPrototipJucator(String tip) {
        AJucator jucator = null;
        AJucator prototipJucator = prototipuriJucatori.get(tip);
        if (prototipJucator != null) {
            jucator = prototipJucator.clone();
        }
        return jucator;
    }
}
