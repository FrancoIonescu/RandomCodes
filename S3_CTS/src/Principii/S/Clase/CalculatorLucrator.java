package Principii.S.Clase;

public class CalculatorLucrator implements ICalculator{

    @Override
    public float calculatorSalariu(Angajat angajat) {
        return 100 + ((Lucrator)angajat).getNrOre();
    }
}
