package domain;

import java.util.ArrayList;
import java.util.List;

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

}
