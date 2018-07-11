package domain;

public class Fixture {

	public static void initialize() {
		Alumno alumno1 = new Alumno("Gustavo", "Ramirez", 12344320, "GusRamirez");
		Alumno alumno2 = new Alumno("Lautaro", "Rios", 77537830, "LauRios");
		Alumno alumno3 = new Alumno("Pedro", "Gomez", 34527430, "PedroGomez");

		AlumnosRepository.agregar(alumno1);
		AlumnosRepository.agregar(alumno2);
		AlumnosRepository.agregar(alumno3);
	}

}
