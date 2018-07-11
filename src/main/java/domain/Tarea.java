package domain;

import java.util.LinkedList;
import java.util.List;
import org.uqbar.commons.model.annotations.Observable;


@Observable
public class Tarea {
	public String nombre; // Ej "Primer Parcial", "TP Arena"
	public List<Calificacion> calificaciones = new LinkedList<Calificacion>();

	public Tarea(String nombre) {
		this.nombre = nombre;
	}
}
