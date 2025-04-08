package Factory.FactoryMethod.clase;

public class FactoryTelefonS20 implements IFactory{
    @Override
    public ITelefon createTelefon() {
        return new TelefonS20();
    }
}
