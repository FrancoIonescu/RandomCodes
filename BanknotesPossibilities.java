public class BanknotesPossibilities {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        int solutie = 10;
        int nrSolutii = 0;
        int solutiePartiala = 0;
        int iteratiiI = 0;
        int iteratiiJ = 0;
        int iteratiiK = 1;

        for (int iteratii = 0; iteratii < 500; iteratii++) {

            for (int i = 0; i < iteratiiI; i++) {
                solutiePartiala += numbers[0];
            }

            if (solutiePartiala == solutie) {
                System.out.println(iteratiiI + " " + iteratiiJ + " " + iteratiiK);
                nrSolutii++;
                if (numbers[0] * iteratiiI >= solutie) {
                    break;
                }
            }

            for (int j = 0; j < iteratiiJ; j++) {
                solutiePartiala += numbers[1];
            }
            if (solutiePartiala > solutie) {
                iteratiiJ = 0;
                iteratiiK = 0;
                iteratiiI++;
                solutiePartiala = 0;
            }
            else if (solutiePartiala == solutie) {
                System.out.println(iteratiiI + " " + iteratiiJ + " " + iteratiiK);
                iteratiiI++;
                iteratiiJ = 0;
                nrSolutii++;
                solutiePartiala = 0;
                continue;
            }
            for (int k = 0; k < iteratiiK; k++) {
                solutiePartiala += numbers[2];
            }
            if (solutiePartiala > solutie) {
                iteratiiK = 0;
                iteratiiJ++;
            }
            else if (solutiePartiala < solutie && solutie > (numbers[0] * iteratiiI)) {
                iteratiiK++;
            }
            else if (solutiePartiala == solutie) {
                System.out.println(iteratiiI + " " + iteratiiJ + " " + iteratiiK);
                iteratiiJ++;
                iteratiiK = 0;
                nrSolutii++;
            }
            solutiePartiala = 0;
        }
        System.out.println(nrSolutii);
    }

}