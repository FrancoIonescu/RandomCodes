package Principii.S.Clase;

public class HR {
    public boolean verificaPromovare(Angajat angajat){
        if (angajat.getNume().length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
