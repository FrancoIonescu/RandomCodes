package clase;

import java.util.List;

public class AfisareAplicanti {

	public static void afisareAplicanti(List<List<Aplicant>> aplicanti) {
		for (List<Aplicant> lista : aplicanti) {
			for (Aplicant aplicant : lista) {
				System.out.println(aplicant.toString());
			}
		}
	}
}
