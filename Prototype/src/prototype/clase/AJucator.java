package prototype.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class AJucator implements Cloneable{

    protected String numeJucator;
    protected List<String> medicamenteInterzise;
    protected String pozitieJucator;
    protected String sportPracticat;

    public void setNumeJucator(String numeJucator) {
        this.numeJucator = numeJucator;
    }

    public String getNumeJucator() {
        return numeJucator;
    }

    public List<String> getMedicamenteInterzise() {
        return medicamenteInterzise;
    }

    public String getPozitieJucator() {
        return pozitieJucator;
    }

    public void setPozitieJucator(String pozitieJucator) {
        this.pozitieJucator = pozitieJucator;
    }

    public abstract void adaugareMedicamentInterzis(String medicamentInterzis);

    public abstract void stergeMedicamentInterzis(String medicamentInterzis);

    public abstract void afisareDetalii();

    @Override
    public String toString() {
        return "AJucator{" +
                "numeJucator='" + numeJucator + '\'' +
                ", medicamenteInterzise=" + medicamenteInterzise +
                ", pozitieJucator='" + pozitieJucator + '\'' +
                ", sportPracticat='" + sportPracticat + '\'' +
                '}';
    }

    @Override
    public AJucator clone() {
        AJucator jucator = null;
        try {
            jucator = (AJucator) super.clone();
            jucator.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);
        } catch (CloneNotSupportedException e) {
            throw new JucatorException("Clonarea nu este suportata!");
        }
        return jucator;
    }
}
