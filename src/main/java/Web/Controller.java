package Web;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import spark.Request;
import spark.Response;

public class Controller {
	
	static Service service = new Service();
	
	public static String getAlumno(Request req, Response res) {
		return service.getAlumno().toString();
	}
	
	public static String updateAlumno(Request req, Response res) {
		
		JsonObject alumnoModificado = new JsonObject();

		alumnoModificado = new JsonParser().parse(req.body()).getAsJsonObject();

		JsonObject response = service.actualizarAlumno(alumnoModificado);
		
		return response.toString();
	}
	
	public static String getNotas(Request req, Response res) {
		return service.getTareas().toString();
	}

}
