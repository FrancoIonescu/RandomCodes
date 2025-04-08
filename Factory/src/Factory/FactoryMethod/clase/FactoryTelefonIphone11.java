package Factory.FactoryMethod.clase;

public class FactoryTelefonIphone11 implements IFactory{
    @Override
    public ITelefon createTelefon() {
        return new TelefonIphone11();
    }
}
