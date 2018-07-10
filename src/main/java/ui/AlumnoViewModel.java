package ui;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import domain.Alumno;
import domain.AlumnosRepository;

@Observable

public class AlumnoViewModel {
	
	private List<Alumno> alumnos;
	private Alumno alumnoSeleccionado;
	private int legajo;

	  public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public AlumnoViewModel() {
	    this.alumnos = AlumnosRepository.all();
	  }
	  
	  public Alumno getAlumnoSeleccionado() {
		return alumnoSeleccionado;
	}

	public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
		this.alumnoSeleccionado = alumnoSeleccionado;
	}

	public List<Alumno> getAlumnos() {
		  return alumnos;
	  }
	
	public void registrarLegajo() {
		this.alumnoSeleccionado = AlumnosRepository.dameAlumnoConLegajo(legajo);
	}
	  
	  
}
