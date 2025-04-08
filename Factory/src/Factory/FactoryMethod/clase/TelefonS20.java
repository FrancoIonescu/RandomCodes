package Factory.FactoryMethod.clase;

import java.util.ArrayList;
import java.util.List;

public class TelefonS20 implements ITelefon{

    String denumireTel;
    int anFabricatie;
    List<Integer> dimensiuni;

    public TelefonS20() {
        this.denumireTel = "Samsung S20";
        this.anFabricatie = 2020;
        this.dimensiuni = new ArrayList<>();
        this.dimensiuni.add(18);
        this.dimensiuni.add(8);
    }

    @Override
    public void afisareTelefon() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TelefonS20{" +
                "denumireTel='" + denumireTel + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", dimensiuni=" + dimensiuni +
                '}';
    }
}
