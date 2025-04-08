package Factory.SimpleFactory.program;

import Factory.SimpleFactory.clase.AnimalFactory;
import Factory.SimpleFactory.clase.ETipAnimal;
import Factory.SimpleFactory.clase.IAnimal;

public class Main {
    public static void main(String[] args) {

        IAnimal animal;
        AnimalFactory animalFactory = new AnimalFactory();
        try {
            animal = animalFactory.creareAnimal(ETipAnimal.LEU);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        animal.afisareAnimal();
    }
}