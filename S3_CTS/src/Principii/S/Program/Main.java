package Principii.S.Program;

import Principii.S.Clase.CalculatorLucrator;
import Principii.S.Clase.CalculatorManager;
import Principii.S.Clase.Lucrator;
import Principii.S.Clase.Manager;

public class Main {
    public static void main(String[] args) {
        Lucrator lucrator = new Lucrator("Gigel", 8);
        Manager manager = new Manager("Ionel", true);

        CalculatorLucrator calculatorLucrator = new CalculatorLucrator();
        CalculatorManager calculatorManager = new CalculatorManager();

        System.out.println();
    }
}
