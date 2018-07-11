package domain;

import org.uqbar.commons.model.annotations.Observable;

import Notas.Nota;

@Observable
public class Calificacion {
	public Alumno alumno;
	public Nota nota;
	private Tarea tarea;
	
	public Calificacion(Alumno alumno, Nota nota, Tarea t) {
		this.alumno = alumno;
		this.nota = nota;
		tarea= t;
	}
	public boolean de(Alumno alumnoABuscar) {
		// TODO Auto-generated method stub
		return alumnoABuscar == alumno;
	}
	public String getTarea() {
		return tarea.nombre;
	}
	public String getNota() {
		return nota.toString();
	}
}
