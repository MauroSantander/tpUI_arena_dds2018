package domain;

import Notas.Nota;
import Notas.NotaConceptual;

public class Conceptual implements Nota {
	NotaConceptual nota;

	public Conceptual(NotaConceptual nota) {
		this.nota = nota;
	}

	public String toString() {
		return nota.toString();
	}

}