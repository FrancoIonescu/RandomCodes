package s06.clase;

public class SenzorBuilder implements AbstractBuilder{

    private boolean activatPM2_5;
    private boolean activatPM10;
    private boolean activatVOC;
    private boolean activatCO2;
    private boolean activatCO;
    private boolean activatTemperatura;
    private boolean activatUmiditate;

    public SenzorBuilder() {
        this.activatPM2_5 = activatPM2_5;
        this.activatPM10 = activatPM10;
        this.activatVOC = activatVOC;
        this.activatCO2 = activatCO2;
        this.activatCO = activatCO;
        this.activatTemperatura = activatTemperatura;
        this.activatUmiditate = activatUmiditate;
    }

    public SenzorBuilder setActivatPM2_5(boolean activatPM2_5) {
        this.activatPM2_5 = activatPM2_5;
        return this;
    }

    public SenzorBuilder setActivatPM10(boolean activatPM10) {
        this.activatPM10 = activatPM10;
        return this;
    }

    public SenzorBuilder setActivatVOC(boolean activatVOC) {
        this.activatVOC = activatVOC;
        return this;
    }

    public SenzorBuilder setActivatCO2(boolean activatCO2) {
        this.activatCO2 = activatCO2;
        return this;
    }

    public SenzorBuilder setActivatCO(boolean activatCO) {
        this.activatCO = activatCO;
        return this;
    }

    public SenzorBuilder setActivatTemperatura(boolean activatTemperatura) {
        this.activatTemperatura = activatTemperatura;
        return this;
    }

    public SenzorBuilder setActivatUmiditate(boolean activatUmiditate) {
        this.activatUmiditate = activatUmiditate;
        return this;
    }

    private void reset() {
        this.activatPM2_5 = false;
        this.activatPM10 = false;
        this.activatVOC = false;
        this.activatCO2 = false;
        this.activatCO = false;
        this.activatTemperatura = false;
        this.activatUmiditate = false;
    }

    @Override
    public Senzor build() {
        Senzor senzor = new Senzor(this.activatPM2_5, this.activatPM10, this.activatVOC, this.activatCO2, this.activatCO,this.activatTemperatura, this.activatUmiditate);
        reset();
        return senzor;
    }
}
