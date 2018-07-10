package domain;

import java.util.ArrayList;
import java.util.List;


public class AlumnosRepository {
	
	private static List<Alumno> alumnos = new ArrayList<>();
	static AlumnosRepository repo = null;
	
	public static AlumnosRepository getInstance() {
		if (repo != null)
			return repo;
		repo = new AlumnosRepository();
		return repo;
	}
	
	public static List<Alumno> all() {
		return alumnos;
	}
	
	public static Alumno dameAlumnoConLegajo(int unLegajo) {
		return alumnos.stream().filter(unAlumno -> unAlumno.legajo == unLegajo).findFirst().get();
	}
	
	public static void agregar(Alumno unAlumno) {
		alumnos.add(unAlumno);
	}

}
