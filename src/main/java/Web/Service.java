package Web;

import com.google.gson.JsonObject;

public class Service {
	
	JsonObject alumno = new JsonObject();
	JsonObject tareas = new JsonObject();
	
	public Service() {
		this.alumno = Inicializador.getAlumno();
		this.tareas = Inicializador.getTareas();
	}
	
	public JsonObject actualizarAlumno(JsonObject alumnoModificado) {
		String first_name = alumnoModificado.get("first_name").toString();
		String last_name = alumnoModificado.get("last_name").toString();
		String github_user = alumnoModificado.get("github_user").toString();
		String code = alumnoModificado.get("code").toString();
		
		this.alumno.addProperty("first_name", first_name);
		this.alumno.addProperty("last_name", last_name);
		this.alumno.addProperty("github_user", github_user);		
		this.alumno.addProperty("code", code);
		
		return this.alumno;
	}

	public JsonObject getAlumno() {
		return alumno;
	}

	public JsonObject getTareas() {
		return tareas;
	}

}
