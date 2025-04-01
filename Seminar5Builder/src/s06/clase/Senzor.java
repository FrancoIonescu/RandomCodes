package s06.clase;

public class Senzor implements AbstractAirQuality {
    private boolean activatPM2_5;
    private boolean activatPM10;
    private boolean activatVOC;
    private boolean activatCO2;
    private boolean activatCO;
    private boolean activatTemperatura;
    private boolean activatUmiditate;

    Senzor(boolean activatPM2_5, boolean activatPM10, boolean activatVOC, boolean activatCO2, boolean activatCO, boolean activatTemperatura, boolean activatUmiditate) {
        this.activatPM2_5 = activatPM2_5;
        this.activatPM10 = activatPM10;
        this.activatVOC = activatVOC;
        this.activatCO2 = activatCO2;
        this.activatCO = activatCO;
        this.activatTemperatura = activatTemperatura;
        this.activatUmiditate = activatUmiditate;
    }

    Senzor setActivatPM2_5(boolean activatPM2_5) {
        this.activatPM2_5 = activatPM2_5;
        return this;
    }

    Senzor setActivatPM10(boolean activatPM10) {
        this.activatPM10 = activatPM10;
        return this;
    }

    Senzor setActivatVOC(boolean activatVOC) {
        this.activatVOC = activatVOC;
        return this;
    }

    Senzor setActivatCO2(boolean activatCO2) {
        this.activatCO2 = activatCO2;
        return this;
    }

    Senzor setActivatCO(boolean activatCO) {
        this.activatCO = activatCO;
        return this;
    }

    Senzor setActivatTemperatura(boolean activatTemperatura) {
        this.activatTemperatura = activatTemperatura;
        return this;
    }

    Senzor setActivatUmiditate(boolean activatUmiditate) {
        this.activatUmiditate = activatUmiditate;
        return this;
    }

    @Override
    public String toString() {
        return "Senzor{" +
                "activatPM2_5=" + activatPM2_5 +
                ", activatPM10=" + activatPM10 +
                ", activatVOC=" + activatVOC +
                ", activatCO2=" + activatCO2 +
                ", activatCO=" + activatCO +
                ", activatTemperatura=" + activatTemperatura +
                ", activatUmiditate=" + activatUmiditate +
                '}';
    }


    @Override
    public void display() {
        System.out.println(this);
    }
}
