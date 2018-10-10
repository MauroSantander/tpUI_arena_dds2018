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
	private String inputLegajo; //sacar?
	private List<Tarea> tareas;
	private String token;
	private String title;

	public String getInputLegajo() {
		return inputLegajo;
	}

	public void setInputLegajo(String inputLegajo) {
		this.inputLegajo = inputLegajo;
		this.legajo = Integer.parseInt(inputLegajo.replaceAll("-|\\.", ""));
	}

	public void setCalificaciones(List<Calificacion> c) {

	}

//	public List<Calificacion> getCalificaciones() {
//		return TareasRepository.getInstance().calificacionesDeAlumno(alumnoSeleccionado);
//	}

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
		Alumno res = AlumnosRepository.dameAlumnoConLegajo(token);
		if(res != null) {
			this.alumnoSeleccionado = res;
			return true;
		}
		return false;
//		res.ifPresent(unAlumno -> this.alumnoSeleccionado = unAlumno);
//		return res.isPresent();
	}

	public Alumno getAlumnoEditado() {
		return alumnoEditado;
	}

	public void setAlumnoEditado(Alumno alumnoEditado) {
		this.alumnoEditado = alumnoEditado;
	}

	public void guardarAlumnoEditado() {
		alumnoSeleccionado.setCode(alumnoEditado.getCode());
		alumnoSeleccionado.setFirst_name(alumnoEditado.getFirst_name());
		alumnoSeleccionado.setLast_name(alumnoEditado.getLast_name());
		alumnoSeleccionado.setGithub_user(alumnoEditado.getGithub_user());
		AlumnosRepository.getInstance().getAlumnoService().saveAlumno(alumnoSeleccionado);
	}
	
	public void crearAlumnoParaEditado() {
		alumnoEditado = new Alumno(alumnoSeleccionado.getFirst_name(),alumnoSeleccionado.getLast_name(),alumnoSeleccionado.getCode(),alumnoSeleccionado.getGithub_user());
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public String getTitle() {
		return title;
	}	
	
	
	
	
}