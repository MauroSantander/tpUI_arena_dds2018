package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TareasRepository {
	private static List<Tarea> tareas = new ArrayList<Tarea>();
	static TareasRepository repo = null;

	public static TareasRepository getInstance() {
		if (repo != null)
			return repo;
		repo = new TareasRepository();
		return repo;
	}

	public static List<Tarea> all() {
		return tareas;
	}

//	public List<Calificacion> calificacionesDeAlumno(Alumno alumnoABuscar) {
//		return tareas.stream().map(t->t.getGrades()). //Tareas=>Calificaciones
//			filter(
//				califs->califs.stream().anyMatch(c->c.de(alumnoABuscar))).//Calificaciones con este alumno
//			//Lista de Calificaciones a calificaciones de este alumno
//			map(
//				(List<Calificacion>califs)->
//					califs.stream().filter((Calificacion c)->c.de(alumnoABuscar)).findFirst().get()).
//			collect(Collectors.toList());//stream=>lista
//	}

	public void agregar(Tarea t) {
		tareas.add(t);
	}

}
