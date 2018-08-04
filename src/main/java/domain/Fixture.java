package domain;

import Notas.NotaConceptual;
import Notas.NotaNumerica;

public class Fixture {

	public static void initialize() {
		Alumno alumno1 = new Alumno("Gustavo", "Ramirez", 1234420, "GusRamirez");
		Alumno alumno2 = new Alumno("Lautaro", "Rios", 7753780, "LauRios");
		Alumno alumno3 = new Alumno("Pedro", "Gomez", 3452740, "PedroGomez");

		AlumnosRepository.agregar(alumno1);
		AlumnosRepository.agregar(alumno2);
		AlumnosRepository.agregar(alumno3);
		
		
		TareaConceptual tarea = new TareaConceptual("Parcial 1");
		tarea.Calificar(alumno1, NotaConceptual.EMas);
		tarea.Calificar(alumno2, NotaConceptual.MBMenos);
		tarea.Calificar(alumno3, NotaConceptual.B);
		TareasRepository.getInstance().agregar(tarea);

		
		TareaNumerica tarea2 = new TareaNumerica("Parcial 2");
		tarea2.Calificar(alumno1, new NotaNumerica(5));
		tarea2.Calificar(alumno2, new NotaNumerica(1));
		tarea2.Calificar(alumno3, new NotaNumerica(10));
		TareasRepository.getInstance().agregar(tarea2);
		
		TareaNumerica tarea3 = new TareaNumerica ("Parcial 3");
		tarea3.Calificar(alumno1, new NotaNumerica(7));
		tarea3.Calificar(alumno2, new NotaNumerica(6));
		tarea3.Calificar(alumno3, new NotaNumerica(8));
		TareasRepository.getInstance().agregar(tarea3);
		
		TareaNumerica tarea4 = new TareaNumerica ("Parcial 4");
		tarea4.Calificar(alumno1, new NotaNumerica(7));
		tarea4.Calificar(alumno2, new NotaNumerica(6));
		tarea4.Calificar(alumno3, new NotaNumerica(8));
		TareasRepository.getInstance().agregar(tarea4);
		
		TareaNumerica tarea5 = new TareaNumerica ("Parcial 5");
		tarea5.Calificar(alumno1, new NotaNumerica(8));
		tarea5.Calificar(alumno2, new NotaNumerica(10));
		tarea5.Calificar(alumno3, new NotaNumerica(9));
		TareasRepository.getInstance().agregar(tarea5);
		
		
	}
}