package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlumnosRepository {

	private static List<Alumno> alumnos = new ArrayList<>();
	private static AlumnoService alumnoService;
	static AlumnosRepository repo = null;

	public static AlumnosRepository getInstance() {
		if (repo != null)
			return repo;
		repo = new AlumnosRepository();
		return repo;
	}

	public AlumnoService getAlumnoService() {
		return alumnoService;
	}

	public static List<Alumno> all() {
		return alumnos;
	}

	public static Alumno dameAlumnoConLegajo(String token) {
		alumnoService = new AlumnoService(token);
		return alumnoService.getAlumno();
//		return alumnos.stream().filter(unAlumno -> unAlumno.token == token).findFirst();
	}

	public static void agregar(Alumno unAlumno) {
		alumnos.add(unAlumno);
	}

}
