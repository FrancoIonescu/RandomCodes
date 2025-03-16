package clase;

public class StatutAplicant {

    public void verificaStatut(Aplicant aplicant) {
        if (aplicant.getPunctaj() > 80) {
            System.out.println("Aplicantul " + aplicant.getNume() + " " + aplicant.getPrenume() + " a fost acceptat!");
        } else {
            System.out.println("Aplicantul " + aplicant.getNume() + " " + aplicant.getPrenume() + " nu a fost acceptat!");
        }
    }
}
