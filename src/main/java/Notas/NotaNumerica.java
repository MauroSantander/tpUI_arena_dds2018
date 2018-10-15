package Notas;

import domain.RangoInvalidoDeNotaException;

public class NotaNumerica implements String {
	Integer nota;
	static int MAX = 10;
	static int MIN = 1;

	public NotaNumerica(int nota) {
		if (nota < MIN || nota > MAX)
			throw new RangoInvalidoDeNotaException();
		this.nota = nota;
	}

	public String toString() {
		return nota.toString();
	}

	public void Incrementar() {
		if (nota < MAX)
			nota++;
	}

	public void Decrementar() {
		if (nota > MIN)
			nota--;
	}
}
