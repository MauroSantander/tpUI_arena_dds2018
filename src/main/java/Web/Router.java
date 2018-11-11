package Web;

import spark.Spark;

public class Router {
	
	public static void configure() {
	
	Spark.get("/students", Controller::getAlumno);
	Spark.post("/students", Controller::updateAlumno);
	Spark.get("/students/assignmets", Controller::getNotas);
	
	}
}
