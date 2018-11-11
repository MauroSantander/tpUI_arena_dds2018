package Web;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Inicializador {
	
	static JsonObject alumno = new JsonObject();
	static JsonObject tareas = new JsonObject();
	static RepoAlumnos repoAlumnos = RepoAlumnos.getInstance();
	static RepoTareas repoTareas = RepoTareas.getInstance();
	
	public static void initialize() {
			
		crearAlumno();
		crearTareas();
		repoAlumnos.add(alumno);
		repoTareas.add(tareas);
	
	}
	
	public static void crearAlumno() {
		
		alumno.addProperty("first_name", "Tony");
		alumno.addProperty("last_name", "Spark");
		alumno.addProperty("github_user", "no_soy_ironman");
		alumno.addProperty("code", 1568425);
		
	}
	
	public static void crearTareas() {
		
		JsonArray calificaciones = new JsonArray();
		
		JsonObject calificacion = new JsonObject();
		
		calificacion.addProperty("id", 1);
		calificacion.addProperty("value", 9);
		calificacion.addProperty("created_at", "08/11/2018");
		calificacion.addProperty("updated_at", "08/11/2018");

		calificaciones.add(calificacion);
		
		JsonObject tarea1 = new JsonObject();
		tarea1.addProperty("id", 1);
		tarea1.addProperty("title", "Tp Anual");
		tarea1.addProperty("description", "SGE");
		tarea1.add("grades", calificaciones);
		
		JsonObject tarea2 = new JsonObject();
		tarea2.addProperty("id", 2);
		tarea2.addProperty("title", "Parcial 1");
		tarea2.addProperty("description", "Parcial 1");
		tarea2.add("grades", calificaciones);
		
		JsonObject tarea3 = new JsonObject();
		tarea3.addProperty("id", 3);
		tarea3.addProperty("title", "Parcial 2");
		tarea3.addProperty("description", "Parcial 2");
		tarea3.add("grades", calificaciones);
				
		JsonArray tareasArray = new JsonArray();
		
		tareasArray.add(tarea1);
		tareasArray.add(tarea2);
		tareasArray.add(tarea3);
		
		tareas.add("assignments", tareasArray);
		
	}

}
