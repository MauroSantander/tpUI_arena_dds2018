package domain;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import Notas.Nota;

@Observable
public class Tarea {
	
	String nombre; //Ej "Primer Parcial", "TP Arena"
	Calificador calificador;
	List<Calificacion> calificaciones = new LinkedList<Calificacion>();
	
	public Tarea(String nombre, Calificador calificador) {
		this.nombre = nombre;
		this.calificador = calificador;
	}
}
