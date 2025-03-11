package Principii.S.Clase;

public class CalculatorManager implements ICalculator{
    @Override
    public float calculatorSalariu(Angajat angajat) {
        return 1000 + ((Manager)angajat).isAreMBA() ? 100 : 0;
    }
}
