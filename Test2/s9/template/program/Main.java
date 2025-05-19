package s9.template.program;

import s9.template.clase.AProcesInterviu;
import s9.template.clase.ProcesInterviuHR;
import s9.template.clase.ProcesInterviuIT;

public class Main {
    public static void main(String[] args) {
        AProcesInterviu interviuIT = new ProcesInterviuIT();
        interviuIT.executareProcesInterviu();

        AProcesInterviu interviuHR = new ProcesInterviuHR();
        interviuHR.executareProcesInterviu();
    }
}
