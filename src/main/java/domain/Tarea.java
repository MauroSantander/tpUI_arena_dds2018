package domain;

import java.util.LinkedList;
import java.util.List;
import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Tarea {
	
	private int id;
	private String title; // Ej "Primer Parcial", "TP Arena"
	private String description;
	private String value;
	private List<Calificacion> grades;

	public Tarea(String unTitulo) {
		this.title = unTitulo;
	}

	public Tarea() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public List<Calificacion> getGrades() {
		return grades;
	}

	public void setGrades(List<Calificacion> grades) {
		this.grades = grades;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
}
