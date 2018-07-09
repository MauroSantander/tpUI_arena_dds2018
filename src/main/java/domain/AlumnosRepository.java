package domain;

import java.util.ArrayList;
import java.util.List;


public class AlumnosRepository {
	
	private List<Alumno> alumnos = new ArrayList<>();
	static AlumnosRepository repo = null;
	
	public static AlumnosRepository getInstance() {
		if (repo != null)
			return repo;
		repo = new AlumnosRepository();
		return repo;
	}
	
	public List<Alumno> all() {
		return this.alumnos;
	}
	
//	public Alumno dameAlumnoConLegajo(int unLegajo) {
//		return ;
//	}

}
