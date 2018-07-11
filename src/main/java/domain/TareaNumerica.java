package domain;

import java.util.LinkedList;
import java.util.List;
import org.uqbar.commons.model.annotations.Observable;

import Notas.NotaNumerica;


@Observable
public class TareaNumerica extends Tarea{
	public TareaNumerica(String nombre) {
		super(nombre);
	}
	public void Calificar(Alumno alumno, NotaNumerica nota) {
		calificaciones.add(new Calificacion(alumno, nota, this));
	}
}
