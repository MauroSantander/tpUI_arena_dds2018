package domain;

public class Fixture {

	public static void initialize() {
		Alumno alumno1 = new Alumno("Gustavo", "Ramirez", 1234420, "GusRamirez");
		Alumno alumno2 = new Alumno("Lautaro", "Rios", 7753780, "LauRios");
		Alumno alumno3 = new Alumno("Pedro", "Gomez", 3452740, "PedroGomez");

		AlumnosRepository.agregar(alumno1);
		AlumnosRepository.agregar(alumno2);
		AlumnosRepository.agregar(alumno3);
	}
}