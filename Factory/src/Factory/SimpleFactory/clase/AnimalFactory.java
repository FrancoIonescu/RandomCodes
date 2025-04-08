package Factory.SimpleFactory.clase;

public class AnimalFactory {

    public IAnimal creareAnimal(ETipAnimal tipAnimal) throws Exception {
        switch (tipAnimal) {
            case LEU:
                return new AnimalLeu();
            case TIGRU:
                return new AnimalTigru();
            default:
                throw new Exception("Nu exista animalul!");
        }
    }
}
