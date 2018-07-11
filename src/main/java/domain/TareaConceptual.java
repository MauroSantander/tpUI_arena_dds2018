package domain;

import org.uqbar.commons.model.annotations.Observable;

import Notas.NotaConceptual;


@Observable
public class TareaConceptual extends Tarea{
	public TareaConceptual(String nombre) {
		super(nombre);
	}
	public void Calificar(Alumno alumno, NotaConceptual nota) {
		calificaciones.add(new Calificacion(alumno, nota, this));
	}
}
