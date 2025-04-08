package Singleton.SingletonRegistry.clase;

import java.util.HashMap;
import java.util.Map;

public class LaptopRegistry {
    private LaptopRegistry(){}
    private static Map<String, ILaptop> colectie = new HashMap<>();
    public static void register(String nume, ILaptop laptop) throws Exception {
        if (colectie.containsKey(nume)) {
            throw new Exception("Key " + nume + " already registered!");
        }
        else {
            colectie.put(nume, laptop);
        }
    }

    public static ILaptop getLaptop(String nume) {
        return colectie.get(nume);
    }
}
