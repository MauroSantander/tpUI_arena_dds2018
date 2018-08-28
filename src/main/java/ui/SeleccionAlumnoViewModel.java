package ui;

import java.util.List;
import java.util.Optional;

import org.uqbar.commons.model.annotations.Observable;

import domain.Alumno;
import domain.AlumnosRepository;
import domain.Calificacion;
import domain.Tarea;
import domain.TareasRepository;
import scala.Console;

@Observable

public class SeleccionAlumnoViewModel {

	private List<Alumno> alumnos;
	private Alumno alumnoSeleccionado;
	private Alumno alumnoEditado;
	private int legajo;
	private String inputLegajo;
	private List<Calificacion> calificaciones;

	public String getInputLegajo() {
		return inputLegajo;
	}

	public void setInputLegajo(String inputLegajo) {
		this.inputLegajo = inputLegajo;
		this.legajo = Integer.parseInt(inputLegajo.replaceAll("-|\\.", ""));
	}

	public void setCalificaciones(List<Calificacion> c) {

	}

	public List<Calificacion> getCalificaciones() {
		return TareasRepository.getInstance().calificacionesDeAlumno(alumnoSeleccionado);
	}

	public SeleccionAlumnoViewModel() {
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

	public Alumno getAlumnoEditado() {
		return alumnoEditado;
	}

	public void setAlumnoEditado(Alumno alumnoEditado) {
		this.alumnoEditado = alumnoEditado;
	}

	public void guardarAlumnoEditado() {
		alumnoSeleccionado.setLegajo(alumnoEditado.getLegajo());
		alumnoSeleccionado.setNombre(alumnoEditado.getNombre());
		alumnoSeleccionado.setApellido(alumnoEditado.getApellido());
		alumnoSeleccionado.setUsuarioGitHub(alumnoEditado.getUsuarioGitHub());
	}
	
	public void crearAlumnoParaEditado() {
		alumnoEditado = new Alumno(alumnoSeleccionado.getNombre(),alumnoSeleccionado.getApellido(),alumnoSeleccionado.getLegajo(),alumnoSeleccionado.getUsuarioGitHub());
	}

}
