package ui;

import java.util.List;
import java.util.Optional;

import org.uqbar.commons.model.annotations.Observable;

import domain.Alumno;
import domain.AlumnosRepository;
import scala.Console;

@Observable

public class AlumnoViewModel {

	private List<Alumno> alumnos;
	private Alumno alumnoSeleccionado;
	private int legajo;
	private String inputLegajo;
	
	public String getInputLegajo() {
		return inputLegajo;
	}

	public void setInputLegajo(String inputLegajo) {
		this.inputLegajo = inputLegajo;
		this.legajo = Integer.parseInt(inputLegajo.replaceAll("-|\\.", ""));
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

	public boolean registrarLegajo() {
		Optional<Alumno> res = AlumnosRepository.dameAlumnoConLegajo(legajo);
		res.ifPresent(unAlumno -> this.alumnoSeleccionado = unAlumno);
		return res.isPresent();
	}

}
