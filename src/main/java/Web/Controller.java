package Web;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import spark.Request;
import spark.Response;

public class Controller {
	
	public static String getAlumno(Request req, Response res) {
		return Inicializador.alumno.toString();
	}
	
	public static String updateAlumno(Request req, Response res) {
		
		JsonObject alumnoModificado = new JsonObject();
		
		alumnoModificado = new JsonParser().parse(req.body()).getAsJsonObject();
		
		String first_name = alumnoModificado.get("first_name").toString();
		String last_name = alumnoModificado.get("last_name").toString();
		String github_user = alumnoModificado.get("github_user").toString();
		String code = alumnoModificado.get("code").toString();
		
		Inicializador.alumno.addProperty("first_name", first_name);
		Inicializador.alumno.addProperty("last_name", last_name);
		Inicializador.alumno.addProperty("github_user", github_user);		
		Inicializador.alumno.addProperty("code", code);
		
		return "UN STRING PORQUE SINO ROMPE";
	}
	
	public static String getNotas(Request req, Response res) {
		return Inicializador.tareas.toString();
	}

}
