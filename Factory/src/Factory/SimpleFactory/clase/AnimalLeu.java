package Factory.SimpleFactory.clase;

import java.util.ArrayList;
import java.util.List;

public class AnimalLeu implements IAnimal{
    int inaltime;
    double greutate;
    List<String> gradiniZoo;

    AnimalLeu() {
        this.inaltime = 170;
        this.greutate = 400;
        this.gradiniZoo = new ArrayList<>();
        this.gradiniZoo.add("Baneasa");
        this.gradiniZoo.add("Constanta");
        this.gradiniZoo.add("Timisoara");
    }

    @Override
    public void afisareAnimal() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AnimalLeu{" +
                "inaltime=" + inaltime +
                ", greutate=" + greutate +
                ", gradiniZoo=" + gradiniZoo +
                '}';
    }
}
