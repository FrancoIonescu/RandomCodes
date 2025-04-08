package Factory.FactoryMethod.clase;

import java.util.ArrayList;
import java.util.List;

public class TelefonIphone11 implements ITelefon{

    String denumireTel;
    int anFabricatie;
    List<Integer> dimensiuni;

    TelefonIphone11() {
        this.denumireTel = "Apple Iphone 11";
        this.anFabricatie = 2021;
        this.dimensiuni = new ArrayList<>();
        this.dimensiuni.add(16);
        this.dimensiuni.add(7);
    }

    @Override
    public void afisareTelefon() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TelefonIphone11{" +
                "denumireTel='" + denumireTel + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", dimensiuni=" + dimensiuni +
                '}';
    }
}
