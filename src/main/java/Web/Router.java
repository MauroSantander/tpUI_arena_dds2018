package Web;

import spark.Spark;

public class Router {
	
	public static void configure() {
	
	Spark.get("/student", Controller::getAlumno);
	Spark.post("/student", Controller::updateAlumno);
	Spark.get("/student/assignmets", Controller::getNotas);
	
	}
}
