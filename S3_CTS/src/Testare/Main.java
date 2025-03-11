package Testare;

import Principii.S.Clase.HR;

public class Main {
    public static void main(String[] args) {
        Angajat angajat = new Angajat("Franco");
        HR hr = new HR();
        System.out.println(hr.verificaPromovare(angajat));
    }
}