package domain;

import Notas.String;
import Notas.NotaConceptual;

public class Conceptual implements String {
	NotaConceptual nota;

	public Conceptual(NotaConceptual nota) {
		this.nota = nota;
	}

	public String toString() {
		return nota.toString();
	}

}