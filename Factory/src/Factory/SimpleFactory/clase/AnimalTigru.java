package Factory.SimpleFactory.clase;

import java.util.ArrayList;
import java.util.List;

public class AnimalTigru implements IAnimal{

    int inaltime;
    double greutate;
    List<String> gradiniZoo;

    AnimalTigru() {
        this.inaltime = 150;
        this.greutate = 340;
        this.gradiniZoo = new ArrayList<>();
        this.gradiniZoo.add("Baneasa");
        this.gradiniZoo.add("Brasov");
        this.gradiniZoo.add("Arad");
    }

    @Override
    public void afisareAnimal() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AnimalTigru{" +
                "inaltime=" + inaltime +
                ", greutate=" + greutate +
                ", gradiniZoo=" + gradiniZoo +
                '}';
    }
}
