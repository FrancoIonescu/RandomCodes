package Principii.S.Clase;

public class Manager extends Angajat{
    private static ICalculator calculator;
    private boolean areMBA;

    static {
        calculator = new CalculatorLucrator();
    }

    public Manager(String nume, boolean areMBA) {
        super(nume);
        this.areMBA = areMBA;
    }

    @Override
    public float getSalariu() {
        return calculator.calculatorSalariu(this);
    }
}
