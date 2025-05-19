package s9.template.clase;

public abstract class AProcesInterviu {
    boolean admis;

    void incepeProcesInterviu() {
        System.out.println("Procesul de interviu a inceput!");
    }

    abstract void desfasurareInterviu();

    void rezultatInterviu() {
        if (admis) {
            System.out.println("Candidatul a fost admis!");
        }
        else {
            System.out.println("Candidatul a fost respins!");
        }
    }

    public final void executareProcesInterviu() {
        incepeProcesInterviu();
        desfasurareInterviu();
        rezultatInterviu();
    }
}
