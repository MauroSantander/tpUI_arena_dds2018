package Web;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;

public class RepoTareas {
	
	protected List<JsonObject> lista = new ArrayList<JsonObject>();
	private static RepoTareas instancia;
	
	public static RepoTareas getInstance() {
		if (instancia == null) {
			instancia = new RepoTareas();
		}
		return instancia;
	}
	
	public void add(JsonObject unaTarea) {
		lista.add(unaTarea);
	}
	
	public List<JsonObject> get() {
		return lista;
	}

}
