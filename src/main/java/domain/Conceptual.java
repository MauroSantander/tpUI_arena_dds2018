package domain;

import Notas.Nota;
import Notas.NotaLetra;

public class Conceptual implements Nota {
	NotaLetra nota;

	public Conceptual(NotaLetra nota) {
		this.nota = nota;
	}

	public String toString() {
		return nota.toString();
	}

}