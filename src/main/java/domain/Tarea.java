package domain;

import java.util.LinkedList;
import java.util.List;
import org.uqbar.commons.model.annotations.Observable;


@Observable
public class Tarea {

	String nombre; // Ej "Primer Parcial", "TP Arena"
	Calificador calificador;
	List<Calificacion> calificaciones = new LinkedList<Calificacion>();

	public Tarea(String nombre, Calificador calificador) {
		this.nombre = nombre;
		this.calificador = calificador;
	}
}
