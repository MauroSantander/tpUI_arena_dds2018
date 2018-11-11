package Web;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonObject;

public class RepoAlumnos {
	
	protected List<JsonObject> lista = new ArrayList<JsonObject>();
	private static RepoAlumnos instancia;
	
	public static RepoAlumnos getInstance() {
		if (instancia == null) {
			instancia = new RepoAlumnos();
		}
		return instancia;
	}
	
	public void add(JsonObject unAlumno) {
		lista.add(unAlumno);
	}
	
	public List<JsonObject> get() {
		return lista;
	}

}
