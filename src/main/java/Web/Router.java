package Web;

import spark.Spark;

public class Router {
	
	public static void configure() {
	
	Spark.get("/student", Controller::getAlumno);
	Spark.put("/student", Controller::updateAlumno);
	Spark.get("/student/assignments", Controller::getNotas);
	
	}
}
