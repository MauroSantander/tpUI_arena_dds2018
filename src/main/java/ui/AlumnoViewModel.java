package ui;

import org.uqbar.commons.model.annotations.Observable;

import domain.Alumno;

@Observable

public class AlumnoViewModel {
	
	 private Alumno unAlumno;

	  public AlumnoViewModel(Alumno unAlumno) {
	    this.unAlumno = unAlumno;
	  }
	  
	  public Alumno getUnAlumno() {
		  return unAlumno;
	  }
}
